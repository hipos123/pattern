package com.yaoxj.factorypattern.simple;

import com.yaoxj.factorypattern.IMilk;

/**
 * Created by Administrator on 2019/12/15.
 */
public class SimpleFactory {
     public static IMilk getMilk(String milkName){
           if("蒙牛".equals(milkName)){
                return  new MengNiuMilk();
           }else if ("特仑苏".equals(milkName)){
               return new MengNiuMilk();
           }else{
               return  new NoMilk();
           }
     }
}
