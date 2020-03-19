package com.live.controller;

import com.live.entity.Order;
import com.live.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class OrderController {
    @Resource
    private OrderService orderService;

    @GetMapping("/getOrderById/{orderId}")
    public Order getOrderById(@PathVariable("orderId") String id){
        return orderService.queryOrderById(id);
    }
}
