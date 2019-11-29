/**
 * Copyright (C), 2018-2019, csust
 * FileName: HelloApiDecorator
 * Author:   Cwolf9
 * Date:     2019/11/04 20:40
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

public class HelloApiDecorator implements HelloService{
    private HelloService hsApi;
    public HelloApiDecorator() {}

    public HelloApiDecorator(HelloService hsApi) {
        this.hsApi = hsApi;
    }

    public void setHsApi(HelloService hsApi) {
        this.hsApi = hsApi;
    }
    @Override
    public void sayMessage() {
        System.out.println("=====装饰器up=====");
        hsApi.sayMessage();
        System.out.println("=====装饰器down=====");
    }
    @Override
    public String getMessage() {return null; }
}
