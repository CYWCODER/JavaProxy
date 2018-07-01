package com.jiazhi.java.jdkProxy;

import com.jiazhi.java.staticProxy.IUserDao;

/**
 * @Author jiazhi
 * @Description
 * @Date 2018/7/1/001 11:37
 */
public class JdkProxyTest {

    public static void main(String[] args) {
        IjdkUserDao userDao = new  JdkUserDao();
        IjdkUserDao proxy = (IjdkUserDao) new ProxyFactory(userDao).getProxyInstance();
        System.out.println(proxy.getClass());
        proxy.save();
        proxy.show(10);
    }

}
