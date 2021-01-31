package com.abel.dp.bridge.demo;

/**
 * description TODO
 *
 * @author wangchangsheng
 * @date 2021/1/24 12:11 上午
 */
public class Huawei implements Brand{
    @Override
    public void open() {
        System.out.println("华为电脑开机中");
    }

    @Override
    public void close() {
        System.out.println("华为电脑关机中");
    }

    @Override
    public void work() {
        System.out.println("华为电脑办公中");
    }
}
