package com.jiazhi.java.jdkProxy;

import com.jiazhi.java.staticProxy.IUserDao;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author jiazhi
 * @Description
 * @Date 2018/7/1/001 11:32
 */
public class ProxyFactory {

    private IjdkUserDao  target;

    public  ProxyFactory(IjdkUserDao userDao){
        this.target  = userDao;
    }

    public Object getProxyInstance(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler(){
                    public Object invoke(Object proxy, Method method, Object[] args)
                            throws Throwable {
                        System.out.println("目标对象运行前");
                        //执行目标对象方法
                        Object returnValue = method.invoke(target, args);
                        System.out.println("目标对象运行后");
                        return returnValue;
                    }
                });


    }
}
