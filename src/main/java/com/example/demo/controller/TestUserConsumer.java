package com.example.demo.controller;

import com.example.demo.data.service.ServiceData;
import com.example.demo.data.user.UserInfo;
import com.example.demo.feign.ProviderUserInfoFeign;
import com.example.logindemo.request.LoginRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
public class TestUserConsumer {

    @Autowired
    private ProviderUserInfoFeign providerUserInfoFeign;

    @GetMapping("/api/consumer/all/userinfos")
    public List<UserInfo> getUsers() {
        return providerUserInfoFeign.getUsers();
    }

    @PostMapping("/api/consumer/upload")
    public ServiceData<?> uploadInfo(
            @RequestParam String username,
                     @RequestPart MultipartFile file) {
        return providerUserInfoFeign.uploadInfo(username, file);
    }

    @PostMapping("/api/consumer/login")
    public ServiceData<?> getLoginInfo(@RequestBody LoginRequest request) {
        return providerUserInfoFeign.login(request);
    }
}
