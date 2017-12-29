package com.panda.service;

import com.panda.po.Person;
import com.panda.responsiry.PersonResposiry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author :Mack Chen
 * Email :mackc@synnex.com
 * @Date :10:35 in 11/27/17
 * Description :
 * Modified :
 */
@Service
public class PersonServiceImpl implements PersonService{

    @Autowired
    private PersonResposiry personResposiry;

    @Transactional
    public Person save(Person person) {
        if (person == null)
            throw new NullPointerException("传入对象为空");
        personResposiry.save(person);
        return person;
    }

    @Transactional
    public Iterator<Person> save(Iterator<Person> list) {
        if (list == null)
            throw new NullPointerException("传入对象为空");
        while (list.hasNext()) {
            personResposiry.save(list.next());
        }
        return list;
    }

    @Override
    public Person findOne(Integer id) {
        if (id == null)
            throw new NullPointerException("传入的id为空");
        return personResposiry.findOne(id);
    }

    @Override
    public boolean exist(Integer id) {
        if (id == null)
            throw new NullPointerException("传入id为空");
        return personResposiry.exists(id);
    }

    @Override
    public Iterable<Person> findAll() {
        return personResposiry.findAll();
    }

    @Override
    public Long count() {
        return personResposiry.count();
    }

    @Override
    public void delete(Integer id) {
        if (id == null)
            throw new NullPointerException("传入id为空");
        personResposiry.delete(id);
    }

    @Override
    public void delete(Person person) {
        if (person == null)
            throw new NullPointerException("传入对象为空");
        personResposiry.delete(person);
    }

    @Override
    public void deleteAll() {
        personResposiry.deleteAll();
    }

    @Override
    public Iterable<Person> findByCid(Integer cid) {
        if (cid == null) {
            throw new NullPointerException("传入查询id为空");
        }
        return personResposiry.findByCid(cid);
    }

    @Override
    public int updateById(String name, String sex, Integer id) {
        if(id == null) {
            throw   new NullPointerException("传入更新的id为空");
        }
        if (!exist(id)) {
            throw new NullPointerException("数据库中无对应记录");
        }
        Person person = findOne(id);
        if (name == null || ("").equals(name)) {
            name = person.getName();
        }
        if (sex == null || ("").equals(sex)) {
            sex = person.getSex();
        }
        return personResposiry.updateById(name,sex,id);
    }
}
