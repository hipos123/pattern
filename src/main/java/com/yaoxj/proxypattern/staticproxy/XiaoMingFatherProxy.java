package com.yaoxj.proxypattern.staticproxy;

/**
 * @description:
 * @author: yaoxj
 * @create: 2019-12-31 10:36
 **/
public class XiaoMingFatherProxy  implements  IGreatEvent{
    private XiaoMingSon xiaoMingSon;
    public XiaoMingFatherProxy(XiaoMingSon xiaoMingSon){
        this.xiaoMingSon=xiaoMingSon;
    }


    public void findLove() {
        System.out.println("帮忙物色妹子，了解家庭情况");
        xiaoMingSon.findLove();
        System.out.println("撩了差不多了，又得准备礼金了");
    }
}
