package com.abel.dp.proxy.dynamicproxy;

import com.abel.dp.proxy.staticproxy.Order;
import com.abel.dp.proxy.staticproxy.OrderApi;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * description TODO
 *
 * @author wangchangsheng
 * @date 2021/1/25 10:29 下午
 */
public class DynamicProxy implements InvocationHandler {

    //被代理的对象
    private OrderApi order = null;

    public OrderApi getProxyInterface(Order order) {
        //设置被代理的对象，好方便invoke里面的操作
        this.order = order;
        //把真正的订单对和动态代理关联起来
        OrderApi orderApi = (OrderApi) Proxy.newProxyInstance(order.getClass().getClassLoader(), order.getClass().getInterfaces(), this);
        return orderApi;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 如果是调用setter方法就需要检查权限
        if (method.getName().startsWith("set")) {
            if (order.getOrderUser() != null && order.getOrderUser().equals(args[1])) {
                beforeAction();
                //自己逻辑
                Object object = method.invoke(order, args);
                afterAction();
                return object;
            } else {
                beforeAction();
                System.out.println("对不起，" + args[1] + ",您无权修改本订单中的数据");
                afterAction();
            }
        } else {
            beforeAction();
            //自己逻辑
             Object object = method.invoke(order, args);
             afterAction();
            return object;
        }
        return null;
    }

    private void afterAction() {
        System.out.println("后置增强");
    }

    private void beforeAction() {
        System.out.println("前置增强");
    }
}
