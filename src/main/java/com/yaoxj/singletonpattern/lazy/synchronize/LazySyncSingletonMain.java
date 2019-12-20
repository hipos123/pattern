package com.yaoxj.singletonpattern.lazy.synchronize;

/**
 * @description:
 * @author: yaoxj
 * @create: 2019-12-20 13:52
 **/
public class LazySyncSingletonMain {

    public static void main(String[] args) {

        long startTime=System.currentTimeMillis();
        for (int i=0;i<100;i++){
            Thread t=new Thread(new Runnable() {
                public void run() {
//                    LazySyncSingleton.getInstance();
                    System.out.println(Thread.currentThread().getName()+"==="+ LazySyncSingleton.getInstance());
                }
            },"线程一：");
            t.start();
        }
        long endTime=System.currentTimeMillis();
        System.out.println("当前程序耗时："+(endTime-startTime)+"ms");

    }
}
