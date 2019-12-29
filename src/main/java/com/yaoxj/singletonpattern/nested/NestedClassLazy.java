package com.yaoxj.singletonpattern.nested;

/**
 * @description:
 * @author: yaoxj
 * @create: 2019-12-20 14:51
 **/
public class NestedClassLazy {
    private NestedClassLazy(){}

    public static NestedClassLazy getInstance(){
        return NestedClassHolder.nestedClassLazy;
    }

    private static  class NestedClassHolder{
        private static NestedClassLazy nestedClassLazy=new NestedClassLazy();
    }
}
