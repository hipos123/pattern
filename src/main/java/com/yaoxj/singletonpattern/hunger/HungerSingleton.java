package com.yaoxj.singletonpattern.hunger;

/**
 * @description:
 * @author: yaoxj
 * @create: 2019-12-20 11:57
 **/
public class HungerSingleton {

    //系统加载的时候就实例化出了这个对象
    private static HungerSingleton hungerSingleton=new HungerSingleton();
    private HungerSingleton(){
        System.out.println("构造函数被调用");
    }

    public static HungerSingleton getInstance(){
        return hungerSingleton;
    }
}

