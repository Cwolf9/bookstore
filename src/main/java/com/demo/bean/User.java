/**
 * Copyright (C), 2018-2019, csust
 * FileName: User
 * Author:   Cwolf9
 * Date:     2019/11/09 15:04
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
package com.demo.bean;

import javax.persistence.*;

@Entity
//指定表名，指定唯一约束
@Table(name = "user",uniqueConstraints = {@UniqueConstraint(columnNames = {"id","name"})})
public class User {
    @Id//指定主键
    @GeneratedValue
    private int id;
    @Column
    private String name;
    @Column
    private String password;

    //一对一映射
//    @OneToOne(optional = true, cascade = CascadeType.ALL)
//    @JoinColumn(name = "articleId", unique = true)
//    public Article article;

    //省略了getter和setter


    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String toString() {
        return "User: id: " + id + ", name: "+name+", password: "+password;
    }
}