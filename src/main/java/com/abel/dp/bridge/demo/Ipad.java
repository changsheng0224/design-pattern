package com.abel.dp.bridge.demo;

/**
 * description TODO
 *
 * @author wangchangsheng
 * @date 2021/1/24 12:15 上午
 */
public class Ipad extends Computer {
    public Ipad(Brand brand) {
        super(brand);
        System.out.println("平板电脑");
    }
    public void open() {
        super.open();
        System.out.println("平板电脑");
    }
    public void close() {
        super.close();
        System.out.println("平板电脑");
    }
    public void work() {
        super.work();
        System.out.println("平板电脑");
    }
}
