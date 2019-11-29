/**
 * Copyright (C), 2018-2019, csust
 * FileName: Service
 * Author:   Cwolf9
 * Date:     2019/11/09 15:12
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * Cwolf9           2019/11/09           2018.3
 * <p>
 * 〈可怕的是比你强的人比你还努力〉
 * 〈〉
 *
 * @author Cwolf9
 * @create 2019/11/09
 * @since 1.0.0
 */
/**
 * 〈可怕的是比你强的人比你还努力〉
 * 〈〉
 *
 * @author Cwolf9
 * @create 2019/11/09
 * @since 1.0.0
 */
package com.demo.service;

import com.demo.bean.User;
import com.demo.util.JpaUtil;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class Service {
    public static EntityManager em;
    public void testInsert() {
        for(int i = 0; i < 10; ++i) {
            User u = new User("Person" + i, "password"+i);
            //开启事务
            em.getTransaction().begin();
            //执行保存
            em.persist(u);
            //提交事务
            em.getTransaction().commit();
        }
    }
    public void close() {
        //释放资源
        em.close();
    }
    public List<User> getUserList() {
        String sql = "select a from User a";
        Query query = em.createQuery(sql);
        return query.getResultList();
    }
    public void testDelete(int id) {
        em.getTransaction().begin();
        User u = em.getReference(User.class, id);
        if(u == null) {
            System.out.println("删除失败！");
            return;
        }
        //执行删除,将持久化状态的对象从数据库中删除
        em.remove(u);
        em.getTransaction().commit();
    }
    public void testUpdate(int id) {
        em.getTransaction().begin();
        User u = em.find(User.class, id);
        u.setName("new" + id);
        em.merge(u);
        em.getTransaction().commit();
    }
    public static void main(String[] args) {
        em = JpaUtil.getEntityManager();
        Service ms = new Service();
//        ms.testInsert();
        System.out.println("sql查询语句返回结果集：");
        List<User> lu = ms.getUserList();
        for(User a: lu) {
            System.out.println(a);
        }
        //根据主键获取对象
        System.out.println("根据主键获取对象:");
        System.err.println(em.find(User.class,44));
        System.err.println(em.getReference(User.class,49));
        System.out.println("根据主键删除对象：");
        ms.testDelete(47);
        System.err.println(em.find(User.class,47));
        System.out.println("根据主键更新对象：");
        System.err.println(em.getReference(User.class,49));
        ms.testUpdate(49);
        System.err.println(em.getReference(User.class,49));
        ms.close();
    }
}
