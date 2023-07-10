package proxy.house2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
public class ProxyUtil {
    public static Object getProxyObject(Object obj) {
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if ("sale".equals(method.getName())) {
                            System.out.println("step1:first...");
                            Object invoke = method.invoke(obj, args);
                            System.out.println("step3:end...");
                            return invoke;
                        }
                        return null;
                    }
                }
        );
    }
}
