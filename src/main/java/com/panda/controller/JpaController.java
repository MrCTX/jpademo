package com.panda.controller;

import com.panda.po.BoyProperties;
import com.panda.po.Person;
import com.panda.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Iterator;
import java.util.List;

/**
 * @Author :Mack Chen
 * Email :mackc@synnex.com
 * @Date :17:06 in 11/15/17
 * Description :
 * Modified :
 */
@Controller
@RequestMapping(value = "/person")
public class JpaController {
    @Autowired
    private BoyProperties boyProperties;
    @Autowired
    private PersonService personService;
    /*
        首页，显示所有person
    */
    @RequestMapping(value = "/aa")
    public String index(HttpSession session) {
        session.setAttribute("default",boyProperties.getName());
        Iterable iterable = personService.findAll();
        Iterator iterator = iterable.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
        System.out.println("hello");
        session.setAttribute("persons",personService.findAll());
        return "index";
    }
}
