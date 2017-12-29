package com.panda.controller;

import com.panda.po.BoyProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author :Mack Chen
 * Email :mackc@synnex.com
 * @Date :16:03 in 11/15/17
 * Description :
 * Modified :
 */
@RestController
public class HelloController {

    /*@Value("${CupSize}")
    private Integer cupSize;
    @Value("${Name}")
    private String name;
    @Value("age")
    private Integer age;*/
    /*private BoyProperties boyProperties;
    @GetMapping(value = {"hello","girl"})
    public String sayHello() {
        return "Hello-Spring-Boot,我的个人信息是:"+boyProperties;
    }*/
}
