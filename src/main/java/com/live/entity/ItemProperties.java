package com.live.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="myspcloud")
public class ItemProperties {
    private String url;

    public void setUrl(String url){this.url=url;}
    public String getUrl(){return url;}
}
