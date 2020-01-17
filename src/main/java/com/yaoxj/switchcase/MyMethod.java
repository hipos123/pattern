package com.yaoxj.switchcase;

public enum MyMethod {

    LINGYONG("lingYong"),
    TUIKU("tuiKu"),
    ZHIBO("zhiBo");

    public String getPropertyStr() {
        return propertyStr;
    }

    public void setPropertyStr(String propertyStr) {
        this.propertyStr = propertyStr;
    }

    private String propertyStr;

    MyMethod(String propertyStr){
        this.propertyStr=propertyStr;
    }

}
