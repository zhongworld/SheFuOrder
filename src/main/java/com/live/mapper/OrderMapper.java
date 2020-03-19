package com.live.mapper;

import com.live.entity.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper {
    Order Sel(String orderId);
}
