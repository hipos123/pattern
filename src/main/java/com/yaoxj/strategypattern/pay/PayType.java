package com.yaoxj.strategypattern.pay;

/**
 * Created by Administrator on 2020/1/5.
 */
public enum PayType {
    ALIPAY(new AliPay()),
    WECHATPAY(new WeChatPay()),
    UNIONPAY(new UnionPay());

    private PayChannel payChannel;

    PayType(PayChannel payChannel) {
        this.payChannel=payChannel;
    }

    public PayChannel getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(PayChannel payChannel) {
        this.payChannel = payChannel;
    }
}
