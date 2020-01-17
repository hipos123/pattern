package com.yaoxj.templatepattern.house;

/**
 * @description:
 * @author: yaoxj
 * @create: 2020-01-06 21:16
 **/
public class TemplateMain {
    public static void main(String[] args) {
        HouseOne houseOne=new HouseOne("花岗石房子",true);
        HouseTwo houseTwo=new HouseTwo("垃圾房子",false);
        houseOne.buildHouse();
        System.out.println("=====================================================");
        houseTwo.buildHouse();
    }
}
