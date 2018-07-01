package com.jiazhi.java.staticProxy;

/**
 * @Author jiazhi
 * @Description
 * @Date 2018/7/1/001 11:09
 */
public class UserDao implements  IUserDao {
    public void save() {
        System.out.println("targe save");
    }
}
