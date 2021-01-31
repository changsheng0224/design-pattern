package com.abel.dp.proxy.staticproxy;

/**
 * description TODO
 *
 * @author wangchangsheng
 * @date 2021/1/25 10:16 下午
 */
public class OrderProxy implements OrderApi {
    //持有被代理的具体的目标对象
    private Order order = null;

    public OrderProxy(Order realOrder) {
        this.order = realOrder;
    }

    @Override
    public String getProductName() {
        return this.order.getProductName();
    }

    @Override
    public void setProductName(String productName, String user) {
        // 控制访问权限，只有创建订单的人员才能修改
        if (user != null && user.equals(this.getOrderUser())) {
            order.setProductName(productName, user);
        } else {
            System.out.println("对不起" + user + ",您无权修改订单中的产品名称。");
        }
    }

    @Override
    public int getOrderNum() {
        return this.order.getOrderNum();
    }

    @Override
    public void setOrderNum(int orderNum, String user) {
        // 控制访问权限，只有创建订单的人员才能够修改
        if (user != null && user.equals(this.getOrderUser())) {
            order.setOrderNum(orderNum, user);
        } else {
            System.out.println("对不起" + user + "，您无权修改订单中的订购数量。");
        }

    }

    @Override
    public String getOrderUser() {
        return this.order.getOrderUser();
    }

    @Override
    public void setOrderUser(String orderUser, String user) {
        // 控制访问权限，只有创建订单的人员才能够修改
        if (user != null && user.equals(this.getOrderUser())) {
            order.setOrderUser(orderUser, user);
        } else {
            System.out.println("对不起" + user + "，您无权修改订单中的订购人。");
        }
    }

    @Override
    public String toString() {
        return "productName: " + this.getProductName() + ", orderNum: " + this.getOrderNum() + ",orderUser: " + this.getOrderUser();

    }
}
