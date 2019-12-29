package com.yaoxj.prototypepattern;

import java.io.*;
import java.util.List;

/**
 * Created by Administrator on 2019/12/29.
 */
public class JinGuBang implements Cloneable,Serializable {
    private int height;
    private int weight;
    private String name;
    private List<String> ll;

    @Override
    protected JinGuBang clone()  {
        JinGuBang jinGuBang=null;
        try {
            jinGuBang= (JinGuBang) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return jinGuBang;
    }
    /* 深复制 */
    public  Object deepClone() throws IOException, ClassNotFoundException {

        /* 写入当前对象的二进制流 */
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        /* 读出二进制流产生的新对象 */
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getLl() {
        return ll;
    }

    public void setLl(List<String> ll) {
        this.ll = ll;
    }
}

