/**
 * Copyright (C), 2018-2019, csust
 * FileName: HelloDIByStaticFactory
 * Author:   Cwolf9
 * Date:     2019/11/04 19:50
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
package com.demo.tservice;

import com.demo.tbean.HelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloDIByStaticFactory {
    public static void main(String[] args) {
        //加载类路径下的配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        //根据id从容器中获取Bean，注意此处完全"面向接口编程，而不是面向实现"
        HelloService hsByIndex = (HelloService) context.getBean("DIsfByIndex");
        HelloService hsByType = (HelloService) context.getBean("DIsfByType");
        HelloService hsByName = (HelloService) context.getBean("DIsfByName");
        System.out.println("静态工厂方式方式：");
        hsByIndex.sayMessage();
        System.out.println(hsByType.getMessage());
        hsByName.sayMessage();
    }
}
