package com.jiazhi.java.staticProxy;

/**
 * @Author jiazhi
 * @Description  静态代理
 * @Date 2018/7/1/001 10:38
 */
public class StaticProxy implements  IUserDao {

    private  IUserDao target;

    StaticProxy(IUserDao userDao){

        target = userDao;
    }

    public void save() {
        //dosomething
        System.out.println("代理模式开始");
        if(null!= target){
            target.save();
        }
        //dosomething
        System.out.println("代理模式结束");
    }
}
