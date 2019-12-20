package com.yaoxj.singletonpattern.lazy.base;

/**
 * @description:
 * @author: yaoxj
 * @create: 2019-12-20 13:52
 **/
public class LazySingletonMain {

    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        for (int i=0;i<5000;i++){
            Thread t=new Thread(new Runnable() {
                public void run() {
                    LazySingleton.getInstance();
//                    System.out.println(Thread.currentThread().getName()+"==="+ LazySingleton.getInstance());
                }
            },"线程一：");
            t.start();
        }
        long endTime=System.currentTimeMillis();
        System.out.println("当前程序耗时："+(endTime-startTime)+"ms");

    }
}
