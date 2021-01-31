package com.abel.dp.adapter;

/**
 * description TODO
 *
 * @author wangchangsheng
 * @date 2021/1/19 11:39 下午
 */
public abstract class Player {

    protected String name;

    public Player(String name) {
        this.name = name;
    }

    public abstract void attack();

    public abstract void defense();

}