package proxy.demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DAOLogHandler implements InvocationHandler {
    private Object o;
    private Long startTime;
    private Long endTime;
    public DAOLogHandler(Object o){
        this.o=o;
    }
    public Date setStartTime() {
        this.startTime = System.currentTimeMillis();
        Date date = new Date(this.startTime);
        return date;
    }
    public Date setEndTime() {
        this.endTime = System.currentTimeMillis();
        Date date = new Date(this.endTime);
        return date;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(this.setStartTime());
        Object invoke = method.invoke(this.o, args);
        System.out.println(this.setEndTime());
        return invoke;
    }
    public Object getProxy(){
        Object o = Proxy.newProxyInstance(DAOLogHandler.class.getClassLoader(),this.o.getClass().getInterfaces(),
                this);
        return o;
    }
}
