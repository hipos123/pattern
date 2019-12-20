package com.yaoxj.singletonpattern.lazy.synchronize;

/**
 * @description:
 * @author: yaoxj
 * @create: 2019-12-20 13:51
 **/
public class LazySyncSingleton {
    private static LazySyncSingleton lazySingleton=null;
    private LazySyncSingleton(){
            System.out.println("同步关键字构造函数被调用");
    }

    public static synchronized LazySyncSingleton getInstance(){
        if(lazySingleton==null){
            lazySingleton=new LazySyncSingleton();
        }
        return lazySingleton;
    }

}
