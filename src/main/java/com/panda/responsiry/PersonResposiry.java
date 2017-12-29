package com.panda.responsiry;

import com.panda.po.Person;
import org.hibernate.annotations.SQLUpdate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author :Mack Chen
 * Email :mackc@synnex.com
 * @Date :17:19 in 11/15/17
 * Description :
 * Modified :
 */
public interface PersonResposiry extends JpaRepository<Person, Integer> {

    //利用cid来查询出该class下的所有person
    @Query( value = "select p from Person p where p.sid = ?1")
    Iterable<Person> findByCid(Integer cid);

    @Transactional
    @Modifying
    @Query(value = "update Person p set p.name = ?1,p.sex = ?2 where p.id = ?3")
    int updateById(String name , String sex , Integer id);
}
