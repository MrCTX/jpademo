package com.panda.service;

import com.panda.po.Classes;

import static javafx.scene.input.KeyCode.T;

/**
 * @Author :Mack Chen
 * Email :mackc@synnex.com
 * @Date :15:02 in 11/29/17
 * Description :
 * Modified :
 */
public interface ClassesService {
     Classes save(Classes var1);

    <S extends Classes> Iterable<Classes> save(Iterable<Classes> var1);

    Classes findOne(Integer id);

    boolean exists(Integer id);

    Iterable<Classes> findAll();

    Iterable<Classes> findAll(Iterable<Integer> var1);

    long count();

    void delete(Integer var1);

    void delete(Classes var1);

    void delete(Iterable<? extends Classes> var1);

    void deleteAll();

    Integer updateClasses(String name , Integer id);

}
