package com.yaoxj.switchcase;

import java.lang.reflect.Field;
import java.math.BigDecimal;

/**
 * @description:
 * @author: yaoxj
 * @create: 2020-01-14 15:37
 **/
public class SwitchCaseMain {
    public static void main(String[] args) {
        BaTaiShouHuoRiBaoBiaoMingXi change=(BaTaiShouHuoRiBaoBiaoMingXi)setPropertyVal("LINGYONG",new BigDecimal(222),new BaTaiShouHuoRiBaoBiaoMingXi());
        System.out.println(change.getLingYong());

    }

    private static Object setPropertyVal(String type, BigDecimal val,Object obj){
        MyMethod myMethod=MyMethod.valueOf(type);
        String ps=myMethod.getPropertyStr();
        Field f = null;
        try {
            f = obj.getClass().getDeclaredField(ps);
            if(f!=null){
                f.setAccessible(true);
                f.set(obj, val);
            }

        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return obj;
    }


}
