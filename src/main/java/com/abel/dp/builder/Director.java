package com.abel.dp.builder;

/**
 * description 指挥者类
 *
 * @author wangchangsheng
 * @date 2021/1/17 10:46 下午
 */
public class Director {
    public void constructor(Builder builder) {
        builder.builderPartA();
        builder.builderPartB();
    }
}
