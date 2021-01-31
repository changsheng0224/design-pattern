package com.abel.dp.adapter.demo1;

/**
 * description 客户所期待的接口
 * 目标可以是具体的或抽象的类，也可以是接口。
 *
 * @author wangchangsheng
 * @date 2021/1/19 10:57 下午
 */
public abstract class Target {
    public void request() {
        System.out.println("普通请求！");
    }
}
