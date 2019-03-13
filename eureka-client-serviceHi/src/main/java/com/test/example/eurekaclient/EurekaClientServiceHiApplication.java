package com.test.example.eurekaclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableEurekaClient
public class EurekaClientServiceHiApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientServiceHiApplication.class, args);
    }
    @Value("${server.port}")
    String port;
    @RequestMapping(value = "/Hi")
    public String home (@RequestParam(value = "name",defaultValue = "Kobe")String name){
        return  "Hi," + name+"I'm from port:"+ port;
    }
}

