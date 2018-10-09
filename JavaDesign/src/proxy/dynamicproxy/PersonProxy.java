package proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class PersonProxy {

    private Object obj;

    public PersonProxy(Object obj){
        this.obj = obj;
    }

    public Object createProxy(){
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("dynamicProxy before");
                method.invoke(obj,args);
                System.out.println("dynamicProxy after");
                return null;
            }
        });
    }
}
