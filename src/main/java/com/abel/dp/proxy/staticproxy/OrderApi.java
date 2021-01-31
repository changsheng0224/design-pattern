package com.abel.dp.proxy.staticproxy;

/**
 * description TODO
 *
 * @author wangchangsheng
 * @date 2021/1/25 10:13 下午
 */
public interface OrderApi {
    //获取订单订购的产品名称
    public String getProductName();

    // 设置订单订购的产品名称
    public void setProductName(String productName, String user);

    // 获取订单订购的数量
    public int getOrderNum();

    // 设置订单订购的数量
    public void setOrderNum(int orderNum, String user);

    // 获取创建订单的人员
    public String getOrderUser();

    // 设置创建订单的人员
    public void setOrderUser(String orderUser, String user);


}
