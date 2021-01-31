package com.abel.dp.builder;

/**
 * description Builder抽象建造者类，确定产品有两个部件PartA和PartB组成
 *
 * @author wangchangsheng
 * @date 2021/1/17 10:40 下午
 */
public abstract class  Builder {
    public abstract void builderPartA();
    public abstract void builderPartB();
    // 声明一个得到产品建造后结果的方法
    public abstract Product getResult();
}
