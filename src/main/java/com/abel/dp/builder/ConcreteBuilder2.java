package com.abel.dp.builder;

/**
 * description 具体建造者类2
 * 构造和装配各个组件
 *
 * @author wangchangsheng
 * @date 2021/1/17 10:44 下午
 */
public class ConcreteBuilder2 extends Builder {

    private Product product = new Product();

    @Override
    public void builderPartA() {
        product.addProductParts("Part X");
    }

    @Override
    public void builderPartB() {
        product.addProductParts("Part Y");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
