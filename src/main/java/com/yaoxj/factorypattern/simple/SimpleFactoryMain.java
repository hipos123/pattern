package com.yaoxj.factorypattern.simple;

/**
 * Created by Administrator on 2019/12/15.
 */
public class SimpleFactoryMain {
    public static void main(String[] args) {
        SimpleFactory.getMilk("蒙牛").createMilk();
    }
}
