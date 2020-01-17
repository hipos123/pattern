package com.yaoxj.templatepattern.house;

/**
 * @description:
 * @author: yaoxj
 * @create: 2020-01-06 20:59
 **/
public abstract class HouseTemplate {

    private String houseName;

    public  HouseTemplate(String houseName){
        this.houseName=houseName;
    }

    //钩子方法
    public boolean isBuildToilet(){
        return true;
    }

    public abstract  void  buildDoor();
    public abstract  void  buildWindow();
    public abstract  void  buildWall();
    public abstract  void  buildBase();
    public abstract  void  buildToilet();

    //模板
    public void buildHouse(){
        buildBase();
        buildWall();
        buildDoor();
        buildWindow();
        if(isBuildToilet()){
            buildToilet();
        }
    }


}
