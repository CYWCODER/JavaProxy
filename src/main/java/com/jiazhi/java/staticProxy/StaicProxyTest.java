package com.jiazhi.java.staticProxy;

/**
 * @Author jiazhi
 * @Description
 * @Date 2018/7/1/001 11:12
 */
public class StaicProxyTest {
    public static void main(String[] args) {
        IUserDao userDao = new UserDao();
        IUserDao userDaoProxy = new StaticProxy(userDao);
        userDaoProxy.save();
    }
}
