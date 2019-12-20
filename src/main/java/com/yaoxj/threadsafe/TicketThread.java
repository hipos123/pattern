package com.yaoxj.threadsafe;

import sun.security.x509.SubjectAlternativeNameExtension;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @description:
 * @author: yaoxj
 * @create: 2019-12-20 11:07
 **/
public class TicketThread implements  Runnable {
    private int ticketCount=100;
//    private static AtomicInteger count = new AtomicInteger(100);
    public void run() {
        while (ticketCount>0){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            saleTicket();
        }
    }

    private void saleTicket() {

  /*      if(count.get()>0){
            System.out.println(Thread.currentThread().getName() + "正在出售第" + ( count.decrementAndGet()+1) + "张票");
        }*/
        if(ticketCount>0){
            System.out.println(Thread.currentThread().getName() + "正在出售第" + (100-ticketCount+1) + "张票");
            ticketCount --;
        }

    }
}
