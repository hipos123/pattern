package com.yaoxj.strategypattern.pay;

/**
 * Created by Administrator on 2020/1/5.
 */
public interface PayChannel {
    boolean payMoney(float price);
}
