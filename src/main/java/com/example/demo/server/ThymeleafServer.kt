package com.example.demo.server

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * thymeleaf
 * 1：需要导入对应的依赖
 * <!-- Spring Boot Thymeleaf 起步依赖（自动整合核心依赖 + 自动配置） -->
 * <dependency>
 *     <groupId>org.springframework.boot</groupId>
 *     <artifactId>spring-boot-starter-thymeleaf</artifactId>
 * </dependency>
 *
 * <!-- 可选：如果需要支持 Thymeleaf 3.x 高级特性/兼容性 -->
 * <dependency>
 *     <groupId>org.thymeleaf</groupId>
 *     <artifactId>thymeleaf-spring6</artifactId> <!-- Spring Boot 3.x 用这个，2.x 用 thymeleaf-spring5 -->
 * </dependency>
 *
 * 2：将对应的html文件放入到resources/templates下面  根据 ThymeleafProperties这个配置类 springboot自动组装进来
 */
@Controller
class ThymeleafServer {

    @RequestMapping("/test_thymeleaf")
    public fun getTestThymeleaf(): String{
        return "test"
    }
}