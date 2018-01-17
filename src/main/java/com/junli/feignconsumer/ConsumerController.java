package com.junli.feignconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lijun
 * @time 2018-01-16 15:28
 */
@RestController
public class ConsumerController {
    @Autowired
    HelloServce helloServce;

    @Autowired
    RefactorHelloService   refactorHelloService;

    @GetMapping(value = "/feign-consumer")
    public String helloConsumer() {
        return helloServce.hello();
    }
    @GetMapping(value = "/feign-consumer2")
    public String helloConsumer2() {
        StringBuffer sb = new StringBuffer();
        sb.append(helloServce.hello() ).append("\n");
        sb.append(helloServce.hello("LIJUN") ).append("\n");
        sb.append(helloServce.hello("LIJUN", 29)).append("\n");
        sb.append(helloServce.hello(new com.junli.dto.User("LIJUN",29)));
        return sb.toString();
    }


    @GetMapping(value = "/feign-consumer3")
    public String helloConsumer3() {
        StringBuffer sb = new StringBuffer();
        sb.append(refactorHelloService.hello("LIJUN") ).append("\n");
        sb.append(refactorHelloService.hello("LIJUN", 29)).append("\n");
        sb.append(refactorHelloService.hello(new com.junli.dto.User("LIJUN",29)));
        return sb.toString();
    }

}
