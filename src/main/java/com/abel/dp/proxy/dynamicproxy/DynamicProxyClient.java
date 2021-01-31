package com.abel.dp.proxy.dynamicproxy;

import com.abel.dp.proxy.staticproxy.Order;
import com.abel.dp.proxy.staticproxy.OrderApi;
import com.abel.dp.proxy.staticproxy.OrderProxy;

/**
 * description TODO
 *
 * @author wangchangsheng
 * @date 2021/1/26 7:53 上午
 */
public class DynamicProxyClient {
    public static void main(String[] args) {
        Order order = new Order("产品", 12, "王二");
        // 张三先登陆系统创建了一个订单
        OrderApi proxy = new DynamicProxy().getProxyInterface(order);
        proxy.setProductName("xxx","王二");
    }
}
