package com.yaoxj.proxypattern.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @description:
 * @author: yaoxj
 * @create: 2019-12-31 11:16
 **/
public class ShiJiJiaYuan implements InvocationHandler {

    private Object obj;
    public ShiJiJiaYuan(Object object){
        this.obj=object;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始寻找妹子========");
        Object result=method.invoke(obj,args);
        System.out.println("搞定，收取佣金。。。。");
        return result;
    }
}
