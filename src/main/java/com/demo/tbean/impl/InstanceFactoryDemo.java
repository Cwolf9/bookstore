/**
 * Copyright (C), 2018-2019, csust
 * FileName: InstanceFactoryDemo
 * Author:   Cwolf9
 * Date:     2019/11/04 19:55
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
public class InstanceFactoryDemo {
    public HelloService getInstanceFactory(int index, String message) {
        return new ServiceDemo(index, message);
    }
}
