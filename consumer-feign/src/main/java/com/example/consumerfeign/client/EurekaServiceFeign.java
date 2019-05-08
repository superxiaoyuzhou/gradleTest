package com.example.consumerfeign.client;

import com.example.consumerfeign.fallback.HelloFeignFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "provider-hello",fallback = HelloFeignFallback.class)
public interface EurekaServiceFeign {

    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name);
}
