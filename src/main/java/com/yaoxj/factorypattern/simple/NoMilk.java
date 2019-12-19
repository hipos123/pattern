package com.yaoxj.factorypattern.simple;

import com.yaoxj.factorypattern.IMilk;

/**
 * Created by Administrator on 2019/12/15.
 */
public class NoMilk implements IMilk {
    public void createMilk() {
        System.out.println("无法生产牛奶");
    }
}
