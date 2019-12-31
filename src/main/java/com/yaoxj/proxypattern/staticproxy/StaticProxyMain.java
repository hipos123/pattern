package com.yaoxj.proxypattern.staticproxy;

/**
 * @description:
 * @author: yaoxj
 * @create: 2019-12-31 10:48
 **/
public class StaticProxyMain {
    public static void main(String[] args) {
        XiaoMingFatherProxy xiaoMingFatherProxy=new XiaoMingFatherProxy(new XiaoMingSon());
        xiaoMingFatherProxy.findLove();
    }
}
