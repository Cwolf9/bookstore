/**
 * Copyright (C), 2018-2019, csust
 * FileName: StaticFactory
 * Author:   Cwolf9
 * Date:     2019/11/03 14:15
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
package com.demo.tservice;
import com.demo.tbean.HelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StaticFactory {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        HelloService hs = (HelloService) ac.getBean("helloStaticFactory");
        hs.sayMessage();
    }
}
