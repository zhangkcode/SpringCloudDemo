package com.example.servicefeign.service;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hi",fallback = SchedualServiceHiHystric.class)
//@EnableFeignClients(value ="service-hi" )
public interface ScheduleServiceHi {
    @RequestMapping(value = "/Hi",method = RequestMethod.GET)

    String sayHiFromClientOne(@RequestParam(value = "name") String name);
    //service-hi服务中默认的方法
//    String home();
}
