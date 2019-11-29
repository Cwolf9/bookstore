/**
 * Copyright (C), 2018-2019, csust
 * FileName: Test
 * Author:   Cwolf9
 * Date:     2019/11/13 20:29
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * Cwolf9           2019/11/13           2018.3
 * <p>
 * 〈可怕的是比你强的人比你还努力〉
 * 〈〉
 *
 * @author Cwolf9
 * @create 2019/11/13
 * @since 1.0.0
 */
/**
 * 〈可怕的是比你强的人比你还努力〉
 * 〈〉
 *
 * @author Cwolf9
 * @create 2019/11/13
 * @since 1.0.0
 */
package com.demo.controller;

import com.opensymphony.xwork2.ActionSupport;

public class Test extends ActionSupport {
    @Override
    public String execute() throws Exception {
        System.out.println("程序执行了");
        return SUCCESS;
    }
    public String top() {
        return "top";
    }
    public String showUser() {
        return "update";
    }
}
