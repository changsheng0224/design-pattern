package com.abel.dp.proxy.staticproxy;

/**
 * description TODO
 *
 * @author wangchangsheng
 * @date 2021/1/25 10:15 下午
 */
public class Order implements OrderApi {

    // 订单订购的产品名称
    private String productName;

    // 订单订购的数量
    private int orderNum;

    // 创建订单的人员
    private String orderUser;

    /**
     * 构造方法，传入构建需要的数据
     */
    public Order(String productName, int orderNum, String orderUser) {
        this.productName = productName;
        this.orderNum = orderNum;
        this.orderUser = orderUser;
    }

    @Override
    public String getProductName() {
        return productName;
    }

    @Override
    public void setProductName(String productName, String user) {

    }

    @Override
    public int getOrderNum() {
        return 0;
    }

    @Override
    public void setOrderNum(int orderNum, String user) {

    }

    @Override
    public String getOrderUser() {
        return null;
    }

    @Override
    public void setOrderUser(String orderUser, String user) {

    }
}
