package com.yaoxj.factorypattern.abstractfactory;

import com.yaoxj.factorypattern.IMilk;
import com.yaoxj.factorypattern.funfactory.TeLunSuFactory;
import com.yaoxj.factorypattern.simple.MengNiuMilk;

/**
 * Created by Administrator on 2019/12/15.
 */
public class MilkFactory extends AbstractMilkFactory {
    @Override
    public IMilk GetMengNiuMilk() {
        return new MengNiuMilk();
    }

    @Override
    public IMilk GetTeLunSuMilk() {
//        return new TeLunSuMilk();
        return new TeLunSuFactory().getMilk();
    }
}
