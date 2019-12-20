package com.yaoxj.threadsafe;

/**
 * @description:
 * @author: yaoxj
 * @create: 2019-12-20 11:10
 **/
public class TicketThreadMain {


    public static void main(String[] args) {
        TicketThread th=new TicketThread();
        Thread t1=new Thread(th,"窗口一");
        Thread t2=new Thread(th,"窗口二");
        Thread t3=new Thread(th,"窗口三");
        Thread t4=new Thread(th,"窗口四");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }


}
