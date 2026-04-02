package com.example.demo;

import com.example.demo.data.persion.demo.Dad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients// 开启服务调用
public class DemoApplication {

    @Autowired
    private Dad perSion;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
