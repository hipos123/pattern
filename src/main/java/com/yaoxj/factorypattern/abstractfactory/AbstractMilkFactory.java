package com.yaoxj.factorypattern.abstractfactory;

import com.yaoxj.factorypattern.IMilk;

/**
 * Created by Administrator on 2019/12/15.
 */
public abstract class AbstractMilkFactory {
    public abstract IMilk GetMengNiuMilk();
    public abstract IMilk GetTeLunSuMilk();

    public void xiaodu(){
        System.out.println("可以进行统一消毒");
    }

    public void yunsu(){
        System.out.println("可以进行统一运输");
    }
}
