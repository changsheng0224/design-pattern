package com.abel.dp.adapter.demo1;

/**
 * description 适配器 将目标与被适配的类关联起来
 *
 * @author wangchangsheng
 * @date 2021/1/19 11:16 下午
 */
public class Adapter extends Target {
    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
