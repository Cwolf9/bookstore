/**
 * Copyright (C), 2018-2019, csust
 * FileName: ServiceDemo
 * Author:   Cwolf9
 * Date:     2019/11/04 19:10
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * Cwolf9           2019/11/04           2018.3
 * <p>
 * 〈可怕的是比你强的人比你还努力〉
 * 〈〉
 *
 * @author Cwolf9
 * @create 2019/11/04
 * @since 1.0.0
 */
/**
 * 〈可怕的是比你强的人比你还努力〉
 * 〈〉
 *
 * @author Cwolf9
 * @create 2019/11/04
 * @since 1.0.0
 */
package com.demo.tbean.impl;
import com.demo.tbean.HelloService;

public class ServiceDemo implements HelloService {
    private int index;
    private String message;
    public ServiceDemo(int index, String message) {
        this.index = index;
        this.message = message;
    }
    public ServiceDemo() { }
    @Override
    public void sayMessage() {
        System.out.println("消息" + index+": " + message);
    }
    public String getMessage() {
        return "消息" + index+": " + message;
    }
    public void setIndex(int index) {
        this.index = index;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}
