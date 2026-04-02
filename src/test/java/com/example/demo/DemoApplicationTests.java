package com.example.demo;

import com.example.demo.data.persion.demo.Dad;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    private Dad perSion;

    @Test
    void contextLoads() {
        System.out.println(" contextLoads perSion " + perSion);
    }
}
