package com.yaoxj.singletonpattern.register;

/**
 * @description:
 * @author: yaoxj
 * @create: 2019-12-20 18:30
 **/
public class RegisterSingletonMain {

    public static void main(String[] args) {
        for (int i=0;i<100;i++){
            Thread t=new Thread(new Runnable() {
                public void run() {
                    System.out.println(ContainerSingleton.getBean("com.yaoxj.singletonpattern.register.ContainerSingleton"));
                }
            },"线程一：");
            t.start();
        }

    }
}
