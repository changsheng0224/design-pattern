package com.abel.dp.bridge;

/**
 * description 修正抽象化角色
 *
 * @author wangchangsheng
 * @date 2021/1/23 9:24 下午
 */
public class RefinedAbstraction extends Abstraction {
    public void operation() {
        implementor.operation();
    }
}
