package com.yaoxj.strategypattern.pay;

/**
 * Created by Administrator on 2020/1/5.
 */
public class WeChatPay  implements  PayChannel {
    public boolean payMoney(float price) {
        System.out.println("调用微信sdk进行支付，价格是=="+price);
        return true;
    }
}
