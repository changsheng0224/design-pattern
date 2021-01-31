package com.abel.dp.strategy;

/**
 * description 是一个使用了某种策略的类
 *
 * @author wangchangsheng
 * @date 2021/1/26 10:58 下午
 */
public class Context {
    Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    // 上下文接口
    public void contextInterface() {
        strategy.algorithmInterface();
    }
}
