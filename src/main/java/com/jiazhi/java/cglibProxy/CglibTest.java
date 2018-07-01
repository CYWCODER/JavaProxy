package com.jiazhi.java.cglibProxy;

/**
 * @Author jiazhi
 * @Description
 * @Date 2018/7/1/001 12:18
 */
public class CglibTest {

    public static void main(String[] args){
        CglibUserDao cglibUserDao = new CglibUserDao();

        CglibUserDao proxy = (CglibUserDao) new ProxyFactory(cglibUserDao).getProxyInstance();

        proxy.save();

    }

}
