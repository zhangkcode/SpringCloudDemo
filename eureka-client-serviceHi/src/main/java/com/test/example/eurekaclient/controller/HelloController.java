/*
package com.test.example.eurekaclient.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@SpringBootApplication
public class HelloController {

    */
/* @Autowired
    private DiscoveryClient discoveryClient;

   @RequestMapping("/service-instances/{applicationName}")
    public List<ServiceInstance> serviceInstancesByApplicationName(
            @PathVariable String applicationName) {
        return this.discoveryClient.getInstances(applicationName);
    }*//*

    @Value("${server.port}")
    String port;
    @RequestMapping(value = "/Hi")
    public String home (@RequestParam(value = "name",defaultValue = "Kobe")String name){
        return  "Hi," + name+"I'm from port:"+ port;
    }
}*/
