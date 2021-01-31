package com.abel.dp.bridge;

/**
 * description 抽象化角色
 *
 * @author wangchangsheng
 * @date 2021/1/23 9:22 下午
 */
public abstract class Abstraction {
    //聚合
    protected Implementor implementor;

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }
    public void operation() {
        implementor.operation();
    }
}
