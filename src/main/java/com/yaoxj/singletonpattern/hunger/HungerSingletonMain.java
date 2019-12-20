package com.yaoxj.singletonpattern.hunger;

/**
 * @description:
 * @author: yaoxj
 * @create: 2019-12-20 13:41
 **/
public class HungerSingletonMain {

    public static void main(String[] args) {
        for (int i=0;i<50;i++){
            Thread t=new Thread(new Runnable() {
                public void run() {
                    System.out.println(Thread.currentThread().getName()+"==="+HungerSingleton.getInstance());
                }
            },"线程一：");
            t.start();
            Thread t2=new Thread(new Runnable() {
                public void run() {
                    System.out.println(Thread.currentThread().getName()+"==="+HungerSingleton.getInstance());
                }
            },"线程二：");
            t2.start();
        }

    }
}
