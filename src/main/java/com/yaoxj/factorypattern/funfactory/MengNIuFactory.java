package com.yaoxj.factorypattern.funfactory;

import com.yaoxj.factorypattern.IMilk;
import com.yaoxj.factorypattern.simple.MengNiuMilk;

/**
 * Created by Administrator on 2019/12/15.
 */
public class MengNIuFactory implements  GetMilkFactory {
    public IMilk getMilk() {
        return  new MengNiuMilk();
    }
}
