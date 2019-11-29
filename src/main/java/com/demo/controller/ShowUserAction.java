/**
 * Copyright (C), 2018-2019, csust
 * FileName: ShowUserAction
 * Author:   Cwolf9
 * Date:     2019/11/09 17:45
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
package com.demo.controller;

import com.opensymphony.xwork2.ActionSupport;

public class ShowUserAction extends ActionSupport {
    public static final String MESSAGE = "Hello, World! My Name is Cwolf9!";
    @Override
    public String execute() throws Exception{
        setMessage(MESSAGE);
        System.out.println(message + " " + "success");
        return "success";
    }
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
