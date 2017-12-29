package com.panda.service;

import com.panda.po.Person;
import com.panda.responsiry.PersonResposiry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

/**
 * @Author :Mack Chen
 * Email :mackc@synnex.com
 * @Date :10:22 in 11/27/17
 * Description : person的服务类
 * Modified :
 */
public interface PersonService {

    Person save(Person person);

    Iterator<Person> save(Iterator<Person> list);

    Person findOne(Integer id);

    boolean exist(Integer id);

    Iterable<Person> findAll();

    Long count();

    void delete(Integer id);

    void delete(Person person);

    void deleteAll();

    Iterable<Person> findByCid(Integer cid);

    int updateById(String name , String sex , Integer id);
}
