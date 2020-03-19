package com.live.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Item implements Serializable {
    private static final long serialVersionUID = 758470338390518446L;
    /**
     * id(商品)
     */
    private BigInteger id;
    /**
     * 标题
     */
    private String title;
    /**
     * 图片
     */
    private String pic;
    /**
     * 描述
     */
    private String desc;
    /**
     * 价格
     */
    private BigDecimal price;


    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

}
