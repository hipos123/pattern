package com.yaoxj.singletonpattern.lazy.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @description:
 * @author: yaoxj
 * @create: 2019-12-20 18:24
 **/
public class ContainerSingleton {
    private ContainerSingleton(){}
    private  static Map<String,Object> ioc=new ConcurrentHashMap<String, Object>();

    public  static Object getBean(String beanName){
        Object clazz= null;
        try {
            clazz = Class.forName(beanName).newInstance();
            String name=clazz.getClass().getName();
            if(ioc.containsKey(name)){
                return ioc.get(name);
            }else{
                ioc.put(clazz.getClass().getName(),clazz);
                return  clazz;
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }



}
