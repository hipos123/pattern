package com.yaoxj.strategypattern.pay;

/**
 * Created by Administrator on 2020/1/5.
 */
public class PayMain {
    public static void main(String[] args) {
        PayContent payContent=new PayContent(PayType.ALIPAY);
        payContent.payMoney(22.22f);
        /*if("支付宝".equals("支付宝")){
            PayChannel payChannel=new AliPay();
            payChannel.payMoney(222f);
        }else if(){

        }*/

    }
}
