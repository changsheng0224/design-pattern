package com.abel.dp.adapter;

/**
 * description TODO
 *
 * @author wangchangsheng
 * @date 2021/1/19 11:39 下午
 */
public class Center extends Player {

    public Center(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("中锋 " + name + " 进攻");
    }

    @Override
    public void defense() {
        System.out.println("中锋 " + name + " 防守");
    }

}
