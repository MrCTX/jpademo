package com.panda.service;

import com.panda.po.Classes;
import com.panda.responsiry.ClassesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author :Mack Chen
 * Email :mackc@synnex.com
 * @Date :15:42 in 11/29/17
 * Description :
 * Modified :
 */
@Service
public class ClassesServiceImpl implements ClassesService {
    @Autowired
    private ClassesRepository classesRepository;
    @Override
    public Classes save(Classes var1) {
        return classesRepository.save(var1);
    }

    @Override
    public <S extends Classes> Iterable<Classes> save(Iterable<Classes> var1) {
        return classesRepository.save(var1);
    }

    @Override
    public Classes findOne(Integer id) {
        if (id == null) {
            throw new NullPointerException("传入id为空");
        }
        return classesRepository.findOne(id);
    }

    @Override
    public boolean exists(Integer id) {
        if (id == null) {
            throw new NullPointerException("传入id为空");
        }
        return classesRepository.exists(id);
    }

    @Override
    public Iterable<Classes> findAll() {
        return classesRepository.findAll();
    }

    @Override
    public Iterable<Classes> findAll(Iterable<Integer> var1) {
        return classesRepository.findAll(var1);
    }

    @Override
    public long count() {
        return classesRepository.count();
    }

    @Override
    public void delete(Integer var1) {
        if (var1 == null) {
            throw new NullPointerException("传入id为空");
        }
        classesRepository.delete(var1);
    }

    @Override
    public void delete(Classes var1) {
        classesRepository.delete(var1);
    }

    @Override
    public void delete(Iterable<? extends Classes> var1) {
        classesRepository.delete(var1);
    }

    @Override
    public void deleteAll() {
        classesRepository.deleteAll();
    }

    @Override
    public Integer  updateClasses(String name, Integer id) {
        if (id == null) {
            throw new NullPointerException("传入id为空");
        }
        Classes classes = findOne(id);
        if (name == null || ("").equals(name)) {
            name = classes.getName();
        }
        return classesRepository.updateClasses(name,id);
    }
}
