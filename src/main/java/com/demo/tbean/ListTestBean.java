/**
 * Copyright (C), 2018-2019, csust
 * FileName: ListTestBean
 * Author:   Cwolf9
 * Date:     2019/11/04 20:28
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
package com.demo.tbean;

import java.util.List;

public class ListTestBean {
    private List<String> values;
    public List<String> getValues() {
        return values;
    }
    public void setValues(List<String> values) {
        this.values = values;
    }
    public void forValues() {
        System.out.println(values.toString());
    }
}
