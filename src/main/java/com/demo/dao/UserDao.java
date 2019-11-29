/**
 * Copyright (C), 2018-2019, csust
 * FileName: UserDao
 * Author:   Cwolf9
 * Date:     2019/11/29 20:36
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * Cwolf9           2019/11/29           2018.3
 * <p>
 * 〈可怕的是比你强的人比你还努力〉
 * 〈〉
 *
 * @author Cwolf9
 * @create 2019/11/29
 * @since 1.0.0
 */
/**
 * 〈可怕的是比你强的人比你还努力〉
 * 〈〉
 *
 * @author Cwolf9
 * @create 2019/11/29
 * @since 1.0.0
 */
package com.demo.dao;

import com.demo.bean.User;
import com.demo.util.JpaUtil;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query.*;
import org.springframework.data.repository.Repository;

public class UserDao {
    public static EntityManager em;
    public UserDao() {
        em = JpaUtil.getEntityManager();
    }
    public List<User> findByNameAndPassword(String name, String password) {
        String sql = "select a from User a where name = ? and password = ?";
        Query query = em.createQuery(sql);
        //对占位符赋值，从1开始
        query.setParameter(1, name);//"xx%"
        query.setParameter(2, password);
        return query.getResultList();
    }
//    @Query(value = "select a from User a where name = ?1 and password = ?2", nativeQuery = true)
//    List<User> selectByNameAndPassword(String name, String password);
}
