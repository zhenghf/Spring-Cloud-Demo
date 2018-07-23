package com.zheng.order.server.controller;

import com.zheng.product.client.api.ProductApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private ProductApi productApi;

    @RequestMapping("/hello")
    public String hello(@RequestParam String text) {
        return productApi.hello(text);
    }
}
