package com.example.demo.domain;

/**
 * Created by heliqing on 2018/11/20.
 */
public class User {
    private String name;
    private int age;
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public static User getUser(){
        User u = new User();
        u.setName("吴亦凡");
        u.setAge(14);
        u.setSex("男");
        return u;
    }
}
