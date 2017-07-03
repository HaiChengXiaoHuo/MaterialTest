package com.example.materialtest.bean;

/**
 * 创建时间：2017/7/2.
 * <p>
 * 类备注：一个水果的实体类，在这里我准备放一些水果类的图片，主要就是简单实现一下cardview的效果
 */

public class Fruit {
    private String name;
    private int imageId;

    public Fruit(String name, int imageId) {
        this.name = name;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
