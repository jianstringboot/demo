package com.example.demo.server;
import com.example.demo.data.IServiceData;
import com.example.demo.data.error.ErrorData;
import com.example.demo.data.service.ServiceData;
import com.example.demo.data.persion.demo.Dad;
import com.example.demo.data.persion.IPerSion;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@Validated
public class DemoServer {

    @Autowired
    private Dad perSion;

    @GetMapping(value = "/demo")
    public ServiceData demo(// required = true 表示该参数必填（默认值），不传会报错
                            @RequestParam(value = "personType", required = true) int type,
                            // required = false 表示非必填，defaultValue 设置默认值
                            @RequestParam(value = "desc", required = false, defaultValue = "") String desc,
                            @RequestParam(value = "email",required = false, defaultValue = "") String email
                            //, BindingResult bindingResult
    ){
        ServiceData<? super IServiceData> sData = new ServiceData<>();

        try {
            @Email(message = "必须是一个正确的地址")
            String em = email;
        } catch (Exception e) {
            ErrorData data = new ErrorData();
            data.setErrorMsg(e.toString());
            sData.setCode("300");
            sData.setData(data);
            return sData;
        }

//        if (bindingResult != null && bindingResult.hasErrors()) {
//            // 2. 拼接错误信息返回
//            StringBuilder errorMsg = new StringBuilder();
//            for (FieldError error : bindingResult.getFieldErrors()) {
//                // error.getField()：错误字段名；error.getDefaultMessage()：自定义错误提示
//                errorMsg.append(error.getField()).append("：").append(error.getDefaultMessage()).append("；");
//            }
//            sData.setCode("301");
//            ErrorData data = new ErrorData();
//            data.setErrorMsg(errorMsg.toString());
//            sData.setData(data);
//            return sData;
//        }
        sData.setCode("200");
        sData.setData(getPerSion(type,desc,email));
        return sData;
    }

    private IPerSion getPerSion(@RequestParam(value = "personType", required = true) int type,
                                // required = false 表示非必填，defaultValue 设置默认值
                                @RequestParam(value = "desc", required = false, defaultValue = "") String desc,
                                @RequestParam(value = "email",required = false, defaultValue = "") @Valid String email){
        IPerSion iPerSion = type == 1 ? perSion:perSion.getSon();
        if(!StringUtils.isEmpty(desc)){
            iPerSion.setDesc(desc);
        }
        if(!StringUtils.isEmpty(email) && iPerSion instanceof Dad){
            ((Dad)iPerSion).setEmail(email);
        }
        return iPerSion;
    }
}
