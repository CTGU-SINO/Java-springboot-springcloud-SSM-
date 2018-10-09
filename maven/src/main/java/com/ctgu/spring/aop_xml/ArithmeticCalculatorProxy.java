package com.ctgu.spring.aop_xml;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class ArithmeticCalculatorProxy {

    private Object obj;

    public ArithmeticCalculatorProxy(Object obj) {
        this.obj = obj;
    }

    public Object createProxy() {
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(), new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println(Arrays.asList(args));
                        Object result = method.invoke(obj, args);
                        String methodName = method.getName();
                        System.out.println(methodName + ":" + result);
                        return result;
                    }
                });
    }
}
