package com.abel.dp.bridge.demo;

/**
 * description 电脑
 *
 * @author wangchangsheng
 * @date 2021/1/24 12:13 上午
 */
public class Computer {
    //聚合品牌
    private Brand brand;

    public Computer(Brand brand) {
        this.brand = brand;
    }

    public void open() {
        this.brand.open();
    }
    public void close() {
        this.brand.close();
    }
    public void work() {
        this.brand.work();
    }
}
