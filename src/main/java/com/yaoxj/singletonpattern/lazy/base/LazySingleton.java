package com.yaoxj.singletonpattern.lazy.base;

/**
 * @description:
 * @author: yaoxj
 * @create: 2019-12-20 13:51
 **/
public class LazySingleton {
    private static LazySingleton lazySingleton=null;
    private LazySingleton(){
            System.out.println("构造函数被调用");
    }

    public static LazySingleton getInstance(){
        if(lazySingleton==null){
            lazySingleton=new LazySingleton();
        }
        return lazySingleton;
    }

}
