package com.abel.dp.builder;

/**
 * description 具体建造者类1
 * 构造和装配各个组件
 *
 * @author wangchangsheng
 * @date 2021/1/17 10:42 下午
 */
public class ConcreteBuilder1 extends Builder {

    private Product product = new Product();

    @Override
    public void builderPartA() {
        product.addProductParts("part A");
    }

    @Override
    public void builderPartB() {
        product.addProductParts("part B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
