package com.yaoxj.proxypattern.dynamicproxy;

import com.yaoxj.proxypattern.staticproxy.IGreatEvent;
import com.yaoxj.proxypattern.staticproxy.XiaoMingSon;
import sun.misc.ProxyGenerator;

import java.lang.reflect.Proxy;

/**
 * @description:
 * @author: yaoxj
 * @create: 2019-12-31 11:21
 **/
public class DynamicProxyMain {

    public static void main(String[] args) {
        //加上这句话，会在根目录下生成com.sun.proxy.$ProxyX.class 了。由于 $Proxy0.class 是在内存中的，
        // 在内存中用完就直接删掉了，所以看不到这个class
        //ProxyGenerator.generateProxyClass()
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        IGreatEvent xiaoMingSon= (IGreatEvent) Proxy.newProxyInstance(XiaoMingSon.class.getClassLoader(),new Class[]{IGreatEvent.class},
                new ShiJiJiaYuan(new XiaoMingSon()));

      xiaoMingSon.findLove();
    }
}
