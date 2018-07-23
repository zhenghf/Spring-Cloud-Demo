package com.zheng.order.client.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "order")
@RequestMapping("/order")
public interface OrderApi {

}
