package com.yaoxj.singletonpattern.lazy.nested;

import com.yaoxj.singletonpattern.lazy.base.LazySingleton;

/**
 * @description:
 * @author: yaoxj
 * @create: 2019-12-20 14:56
 **/
public class NestedClassLazyMain {

    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        for (int i=0;i<100;i++){
            Thread t=new Thread(new Runnable() {
                public void run() {
//                        NestedClassLazy.getInstance();
                    System.out.println(Thread.currentThread().getName()+"==="+ NestedClassLazy.getInstance());
                }
            },"线程一：");
            t.start();
        }
        long endTime=System.currentTimeMillis();
        System.out.println("当前程序耗时："+(endTime-startTime)+"ms");
    }
}
