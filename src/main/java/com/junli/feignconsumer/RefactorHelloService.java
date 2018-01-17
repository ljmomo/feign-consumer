package com.junli.feignconsumer;

import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @author lijun
 * @time 2018-01-16 17:41
 */
@FeignClient(value = "springclouddemo")
public interface RefactorHelloService extends com.junli.service.HelloServce {

}
