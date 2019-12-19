package com.yaoxj.factorypattern.simple;

import com.yaoxj.factorypattern.IMilk;

/**
 * Created by Administrator on 2019/12/15.
 */
public class MengNiuMilk implements IMilk {
    public void createMilk() {
        System.out.println("生产蒙牛牛奶==");
    }
}
