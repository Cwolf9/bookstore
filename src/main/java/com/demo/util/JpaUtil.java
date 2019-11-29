/**
 * Copyright (C), 2018-2019, csust
 * FileName: JpaUtil
 * Author:   Cwolf9
 * Date:     2019/11/09 16:00
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
package com.demo.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {
    private static EntityManagerFactory emf;
    static {
        //加载persistence.xml文件中的persistence-util中的配置信息创建EntityManagerFactory对象
        emf = Persistence.createEntityManagerFactory("MyJPA");
    }
    //使用EntityManager创建EntityManager对象
    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
}
