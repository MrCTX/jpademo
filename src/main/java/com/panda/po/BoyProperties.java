package com.panda.po;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @Author :Mack Chen
 * Email :mackc@synnex.com
 * @Date :16:33 in 11/15/17
 * Description :
 * Modified :
 */
@Component
@ConfigurationProperties(prefix = "boy")
public class BoyProperties {
    private Integer cupSize;
    private String name;
    private Integer age;

    public Integer getCupSize() {
        return cupSize;
    }

    public void setCupSize(Integer cupSize) {
        this.cupSize = cupSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
