/**
 * Copyright (C), 2018-2019, csust
 * FileName: HelloServiceImpl2
 * Author:   Cwolf9
 * Date:     2019/11/03 13:56
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * Cwolf9           2019/11/03           2018.3
 * <p>
 * 〈可怕的是比你强的人比你还努力〉
 * 〈〉
 *
 * @author Cwolf9
 * @create 2019/11/03
 * @since 1.0.0
 */
/**
 * 〈可怕的是比你强的人比你还努力〉
 * 〈〉
 *
 * @author Cwolf9
 * @create 2019/11/03
 * @since 1.0.0
 */
package com.demo.tbean.impl;
import com.demo.tbean.HelloService;

public class HelloServiceImpl2 implements HelloService {
    private String message;
    public HelloServiceImpl2() { }
    public HelloServiceImpl2(String s) {
        message = s;
    }
    public String getMessage() {
        return message;
    }

    @Override
    public void sayMessage() {
        System.out.println(message);
    }
    public void setMessage(String message) {
        this.message = message;
    }
}