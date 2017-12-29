package com.panda.responsiry;

import com.panda.po.Classes;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author :Mack Chen
 * Email :mackc@synnex.com
 * @Date :14:58 in 11/29/17
 * Description :
 * Modified :
 */
@Repository
public interface ClassesRepository extends CrudRepository<Classes,Integer> {

    @Transactional
    @Modifying
    @Query( value = "update Classes set  name = ?1 where id = ?2")
    int updateClasses(String name , Integer id);
}
