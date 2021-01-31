package com.abel.dp.adapter;

/**
 * description TODO
 *
 * @author wangchangsheng
 * @date 2021/1/19 11:40 下午
 */
public class Forwards extends Player {

    public Forwards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("前锋 " + name + " 进攻");
    }

    @Override
    public void defense() {
        System.out.println("前锋 " + name + " 进攻");
    }

}
