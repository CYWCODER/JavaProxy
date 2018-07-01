package com.jiazhi.java.cglibProxy;

import java.lang.reflect.Method;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

/**
 * @Author jiazhi
 * @Description
 * @Date 2018/7/1/001 12:15
 */
public class ProxyFactory implements MethodInterceptor {

    private  Object target;

    public ProxyFactory(Object target){
        this.target = target;
    }

    public Object getProxyInstance(){
        Enhancer en = new Enhancer();

        en.setSuperclass(target.getClass());
        en.setCallback(this);
        return en.create();


    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy)
            throws Throwable {

        System.out.println("cglib 代理开始");
        Object returnValue = method.invoke(target,objects);
        System.out.println("cglib 结束");
        return returnValue;
    }
}
