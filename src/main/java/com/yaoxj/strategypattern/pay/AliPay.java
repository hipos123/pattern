package com.yaoxj.strategypattern.pay;

/**
 * Created by Administrator on 2020/1/5.
 */
public class AliPay implements  PayChannel {
    public boolean payMoney(float price) {
        System.out.println("调用支付宝sdk进行支付，价格是=="+price);
        return true;
    }
}
