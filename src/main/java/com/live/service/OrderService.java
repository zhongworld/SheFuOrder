package com.live.service;

import com.live.entity.Item;
import com.live.entity.Order;
import com.live.mapper.OrderMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {
    @Resource
    private OrderMapper orderMapper;
    @Resource
    private ItemService itemService;


    /**
     * 根据订单id查询订单数据
     *
     * @param orderId
     * @return
     */
    public Order queryOrderById(String orderId) {
        Order order = orderMapper.Sel(orderId);
        if (null == order) { return null; }

        String[] items = order.getItemIdArray().split(",");
        List<Item> itemList = new ArrayList<Item>();
        for(String o : items){
            Item item = itemService.queryItemById(new BigInteger(o));
            if (null == item) {
                continue;
            }
            itemList.add(item);
        }
        order.setItems(itemList);
        return order;
    }

}
