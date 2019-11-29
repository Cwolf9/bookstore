/**
 * Copyright (C), 2018-2019, csust
 * FileName: ApiStaticFactoryImpl
 * Author:   Cwolf9
 * Date:     2019/11/03 14:17
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

public class ApiStaticFactoryImpl {
    public static HelloService newInstance(String message) {
        return new HelloServiceImpl2(message);
    }
}
