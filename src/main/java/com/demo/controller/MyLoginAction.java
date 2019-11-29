/**
 * Copyright (C), 2018-2019, csust
 * FileName: MyLoginAction
 * Author:   Cwolf9
 * Date:     2019/11/10 16:35
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * Cwolf9           2019/11/10           2018.3
 * <p>
 * 〈可怕的是比你强的人比你还努力〉
 * 〈〉
 *
 * @author Cwolf9
 * @create 2019/11/10
 * @since 1.0.0
 */
/**
 * 〈可怕的是比你强的人比你还努力〉
 * 〈〉
 *
 * @author Cwolf9
 * @create 2019/11/10
 * @since 1.0.0
 */
package com.demo.controller;

import com.demo.dao.UserDao;
import com.opensymphony.xwork2.ActionSupport;

import java.sql.SQLException;
import java.util.List;

public class MyLoginAction extends ActionSupport {
    private String name;
    private String psw;
    private List<String> list;
    private UserDao udao;
    public String execute() throws ClassNotFoundException {
        System.out.println(list.get(0));
        udao = new UserDao();
        if(udao.findByNameAndPassword(getName(), getPsw()).size() > 0) {
            return "success";
        }else return "fail";
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public List<String> getList() {
        return list;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    public String getName() {
        return name;
    }

    public String getPsw() {
        return psw;
    }
}
