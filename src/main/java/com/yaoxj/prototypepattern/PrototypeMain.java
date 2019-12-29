package com.yaoxj.prototypepattern;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2019/12/29.
 */
public class PrototypeMain {


    public static void main(String[] args) {
         JinGuBang jinGuBang=new JinGuBang();
        String name="金箍棒";
        jinGuBang.setHeight(30);
        jinGuBang.setWeight(100);
        jinGuBang.setName(name);
        List<String> list=new ArrayList<String>();
        list.add("白骨精");
        list.add("玉兔精");
        jinGuBang.setLl(list);
        JinGuBang copyJinGuBang=jinGuBang.clone();
        list.add("蜘蛛精");
        System.out.println(jinGuBang.getLl());
        System.out.println(copyJinGuBang.getLl());

 /*       JinGuBang copyJinGuBang=jinGuBang.clone();
//        System.out.println(copyJinGuBang.getLl());
        list.add("蜘蛛精");
        name="金箍棍棍";
        System.out.println(jinGuBang.getLl());
        System.out.println(copyJinGuBang.getLl());
        jinGuBang.setName(name);
        System.out.println(jinGuBang.getName());
        System.out.println(copyJinGuBang.getName());
 */


        try {
            JinGuBang deepJinGuBang= (JinGuBang) jinGuBang.deepClone();
            list.add("垃圾怪");
            System.out.println(jinGuBang.getLl());
            System.out.println(deepJinGuBang.getLl());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }



    }
}


