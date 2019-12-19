package com.yaoxj.factorypattern.funfactory;

import com.yaoxj.factorypattern.IMilk;
import com.yaoxj.factorypattern.simple.TeLunSuMilk;

/**
 * Created by Administrator on 2019/12/15.
 */
public class TeLunSuFactory implements GetMilkFactory {
    public IMilk getMilk() {
        return new TeLunSuMilk();
    }
}
