package com.yaoxj.factorypattern.abstractfactory;

/**
 * Created by Administrator on 2019/12/15.
 */
public class AbstractFactoryMain {
    public static void main(String[] args) {
        MilkFactory milkFactory=new MilkFactory();
        milkFactory.GetTeLunSuMilk().createMilk();
        milkFactory.yunsu();
    }
}
