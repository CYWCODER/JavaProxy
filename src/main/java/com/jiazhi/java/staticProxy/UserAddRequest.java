package com.jiazhi.java.staticProxy;

/**
 * @Author jiazhi
 * @Description
 * @Date 2018/7/1/001 11:05
 */

public class UserAddRequest {

    public String  name;
    public int age;
    public int sex;
    public long mobile;

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

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }
}
