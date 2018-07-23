package com.zheng.product.client.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "product")
@RequestMapping("/product")
public interface ProductApi {

    @GetMapping("/hello")
    public String hello(@RequestParam String text);
}
