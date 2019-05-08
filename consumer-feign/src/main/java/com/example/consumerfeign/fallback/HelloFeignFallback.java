package com.example.consumerfeign.fallback;

import com.example.consumerfeign.client.EurekaServiceFeign;
import org.springframework.stereotype.Component;

@Component
public class HelloFeignFallback implements EurekaServiceFeign {
    @Override
    public String hello(String name) {
        return "feign降级："+ name;
    }
}
