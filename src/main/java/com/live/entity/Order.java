package com.live.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

/**
 * (Order)实体类
 *
 * @author makejava
 * @since 2020-03-17 10:39:13
 */
public class Order implements Serializable {
    private static final long serialVersionUID = -67566731984588517L;
    
    private String orderId;
    
    private Long userId;
    
    private Date createDate;
    
    private Date updateDate;

    private String itemIdArray;

    private List<Item> items;


    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getItemIdArray() {
        return itemIdArray;
    }

    public void setItemIdArray(String itemIdArray) {
        this.itemIdArray = itemIdArray;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

}