package com.yaoxj.singletonpattern.lazy.base;

/**
 * @description:
 * @author: yaoxj
 * @create: 2019-12-20 18:42
 **/
public class OtherSingletonExtends extends ParentClazz{


    public  void getname(){
        System.out.println("myname is hhh");
    }
    //a继承b类，在创建对象a的时候，会自动调用父类的构造函数。
//    不能继承，一般我们会对构造函数做手脚。不能继承，继承会发生什么，继承的类在创建对象的时候，会自动调用父类的构造函数，
//    如果我们在这里限制让子类不能调用父类的构造和析构就是实现了不能继承，但是也不能影响自己的使用。
//        extends LazySingleton{

    public static void main(String[] args) {
        OtherSingletonExtends aa=new OtherSingletonExtends();
        aa.getname();
    }
}
