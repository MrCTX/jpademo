package com.panda.controller;

import com.panda.po.BoyProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Method;

/**
 * @Author :Mack Chen
 * Email :mackc@synnex.com
 * @Date :16:47 in 11/15/17
 * Description :
 * Modified :
 */
/*@Controller()需要配合thymeleaf使用,返回从配置文件读取的数据 必须两者一起
    @ResponseBody*/
@RestController
@RequestMapping("/hello")
public class PracController {

    @Autowired
    private BoyProperties boyProperties;

    @RequestMapping(value="/{id}/boy",method= RequestMethod.GET)
    public String say(@PathVariable("id") Integer id) {
        return boyProperties.getName();
    }

    @RequestMapping(value="/boy",method = RequestMethod.GET)
    public String saay(@RequestParam(value="ids",required=true)String ids) {
        return "得到的ids是:"+ids;
    }

   /* @GetMapping(value="/boy")
    public String saay(@RequestParam(value="idds" , required = false)String idds) {
        return "得到的idds是:"+idds;
    }*/

}
