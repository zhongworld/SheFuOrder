package com.live.service;

import com.live.entity.Item;
import com.live.entity.ItemProperties;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.math.BigInteger;

@Service
public class ItemService {
    // Spring框架对RESTful方式的http请求做了封装，来简化操作
    @Resource
    private RestTemplate restTemplate;
    @Resource
    private ItemProperties itemProperties;

    public Item queryItemById(BigInteger id) {
        // 该方法走eureka注册中心调用(去注册中心根据app-item查找服务，这种方式必须先开启负载均衡@LoadBalanced)
        String itemUrl = "http://app-item/getModel/{id}";
        Item result = restTemplate.getForObject(itemUrl, Item.class, id);
        return result;

        //return restTemplate.getForObject(itemProperties.getUrl() + id,Item.class);
    }

}
