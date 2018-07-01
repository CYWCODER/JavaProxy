package com.jiazhi.java.jdkProxy;

/**
 * @Author jiazhi
 * @Description
 * @Date 2018/7/1/001 11:37
 */
public class JdkUserDao  implements  IjdkUserDao{

    public void save() {
        System.out.println("jdk动态代理目标对象执行");
    }

    public void show(int age) {
        System.out.println("jdk动态代理show方法执行"+age);
    }
}
