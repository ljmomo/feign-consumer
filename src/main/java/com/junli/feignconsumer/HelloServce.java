package com.junli.feignconsumer;

import com.junli.dto.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @author lijun
 * @time 2018-01-16 15:26
 */

@FeignClient(value = "springclouddemo")
public interface HelloServce {
    @RequestMapping("/hello")
    String hello();

    @GetMapping("/hello1")
    String hello(@RequestParam("name") String name);

    @GetMapping("/hello2")
    User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age);


    @PostMapping("/hello3")
    String hello(@RequestBody User user);
}
