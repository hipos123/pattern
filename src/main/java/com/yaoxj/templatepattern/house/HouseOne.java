package com.yaoxj.templatepattern.house;

/**
 * @description:
 * @author: yaoxj
 * @create: 2020-01-06 21:07
 **/
public class HouseOne  extends HouseTemplate{
    private String houseName;
    private boolean isBuildToilet;

    public HouseOne(String houseName, boolean isBuildToilet) {
        super(houseName);
        this.houseName=houseName;
        this.isBuildToilet = isBuildToilet;
    }

    public void setBuildToilet(boolean buildToilet) {
        isBuildToilet = buildToilet;
    }

    @Override
    public boolean isBuildToilet() {
        return this.isBuildToilet;
    }



    public void buildDoor() {
        System.out.println(houseName+"的门采用防盗门！");
    }

    public void buildWindow() {
        System.out.println(houseName+"的窗户开在东南方向");
    }

    public void buildWall() {
        System.out.println(houseName+"的墙使用大理石");
    }

    public void buildBase() {
        System.out.println(houseName+"的地基使用钢筋混泥土");
    }

    public void buildToilet() {
        System.out.println(houseName+"的厕所建在西南角");
    }
}
