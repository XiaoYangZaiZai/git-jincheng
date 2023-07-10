package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {
    public static Star getProxyObject(BigStar bigStar) {
        return (Star) Proxy.newProxyInstance(
                bigStar.getClass().getClassLoader(),
                bigStar.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if ("sing".equals(method.getName())) {
                            System.out.println("提供场地，收取费用");
                        } else if ("dance".equals(method.getName())) {
                            System.out.println("提供曲目，收取费用");
                        }
                        return method.invoke(bigStar,args);
                    }
                }
        );

    }

}
