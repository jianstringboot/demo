package com.example.demo.feign;

import com.example.demo.data.login.LoginData;
import com.example.demo.data.multi.MultiFormData;
import com.example.demo.data.service.ServiceData;
import com.example.demo.data.user.UserInfo;
import com.example.logindemo.request.LoginRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@FeignClient(name = "service-provider",url = "http://127.0.0.1:8080")
public interface ProviderUserInfoFeign {

    @GetMapping("/getUserList")
    List<UserInfo> getUsers();

    @PostMapping(value = "/api/data/post/multi/form/upload"
            ,consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    ServiceData<MultiFormData> uploadInfo(
            @RequestParam String username,
            @RequestPart MultipartFile file);

    @PostMapping(value = "/api/data/post/body/login"
            , consumes = MediaType.APPLICATION_JSON_VALUE)
    ServiceData<LoginData> login(@RequestBody LoginRequest request);
}
