package DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class CLocalPicShow {
    private Object target;
    public CLocalPicShow(Object object){
        super();
        this.target=object;
    }

    public Object getTargetInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("准备载入图片 "+args[0].toString());
                        Thread th =new Thread(new Runnable() {
                            @Override
                            public void run() {
                                try {
                                    method.invoke(target,args);
                                } catch (IllegalAccessException | InvocationTargetException e) {
                                    e.printStackTrace();
                                }
                            }
                        });//new thread 结束
                        th.start();
                        return null;
                    }
                }
        );
    }
}
