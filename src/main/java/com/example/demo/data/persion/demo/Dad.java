package com.example.demo.data.persion.demo;

import com.example.demo.data.persion.IPerSion;
import jakarta.validation.constraints.Email;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.Map;

@Component
@Validated
@ConfigurationProperties(prefix = "persion")
public class Dad implements IPerSion {
    private String name;
    private String age;
    private Son son;
    private List<String> list;
    private Map<String,String> map;
    private String desc;
    /**
     *SpringBoot中集成参数校验  JSR-380 校验规范的实现
     * @Length(min = 6,max = 12,message = "appId长度必须位于6到12之间")
     * @NotBlank(message = "名字为必填项")
     * @Email(message = "请填写正确的邮箱地址")
     * @NotEmpty(message = "级别不能为空")
     */
    @Email(message = "请填写正确的邮箱地址")
    private String email;
    @Override
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String getAge() {
        return age;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Son getSon() {
        return son;
    }

    public void setSon(Son son) {
        this.son = son;
    }

    @Component
    public static class Son implements IPerSion{
        private String name;
        private String age;
        private String desc;
        @Override
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDesc() {
            return desc;
        }

        @Override
        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Son{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "PerSion{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", son=" + son +
                ", list=" + list +
                ", map=" + map +
                '}';
    }
}
