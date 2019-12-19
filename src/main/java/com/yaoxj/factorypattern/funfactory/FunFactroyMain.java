package com.yaoxj.factorypattern.funfactory;

/**
 * Created by Administrator on 2019/12/15.
 */
public class FunFactroyMain {
    public static void main(String[] args) {
        GetMilkFactory milkFactory=new MengNIuFactory();
        milkFactory.getMilk().createMilk();

    }
}
