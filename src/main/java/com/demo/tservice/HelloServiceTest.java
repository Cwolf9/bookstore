 /**
 * Copyright (C), 2018-2019, csust
 * FileName: HelloServiceTest
 * Author:   Cwolf9
 * Date:     2019/11/02 20:14
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * Cwolf9           2019/11/02           2018.3
 * <p>
 * 〈可怕的是比你强的人比你还努力〉
 * 〈〉
 *
 * @author Cwolf9
 * @create 2019/11/02
 * @since 1.0.0
 */
/**
 * 〈可怕的是比你强的人比你还努力〉
 * 〈〉
 *
 * @author Cwolf9
 * @create 2019/11/02
 * @since 1.0.0
 */
package com.demo.tservice;
import com.demo.tbean.HelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 public class HelloServiceTest {
    /**
     * 获取spring的IoC核心容器，根据id获取对象
     * ClassPathXmlApplicationContext 加载类路径下的配置文件
     * FileSystemXmlApplicationContext 加载磁盘任意路径下的配置文件
     * AnnotationConfigApplicationContext 用于读取注解创建容器
     * @param args
     */
    public static void main(String[]args) {
        //加载类路径下的配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        //根据id从容器中获取Bean，注意此处完全"面向接口编程，而不是面向实现"
//        HelloService helloService = context.getBean("helloService",HelloService.class);
        HelloService hs = (HelloService) context.getBean("helloService");
        HelloService hs2 = (HelloService) context.getBean("helloService2");
        //执行业务逻辑
        System.out.println("使用无参数默认构造函数创建bean对象：");
        System.out.println("Your message: " + hs.getMessage());
        System.out.println("使用有参数构造函数创建bean对象：");
        hs2.sayMessage();
        HelloService hs3 = (HelloService) context.getBean("helloService3");
        System.out.println("使用实例工厂方法实例化bean：");
        hs3.sayMessage();
    }
}