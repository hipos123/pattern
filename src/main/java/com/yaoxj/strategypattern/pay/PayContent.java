package com.yaoxj.strategypattern.pay;

/**
 * Created by Administrator on 2020/1/5.
 */
public class PayContent {
    private PayType payType;
    public  PayContent(PayType payType){
        this.payType=payType;
    }
    public boolean payMoney(float price){
        return payType.getPayChannel().payMoney(price);
    }
}
