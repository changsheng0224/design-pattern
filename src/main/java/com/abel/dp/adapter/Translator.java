package com.abel.dp.adapter;

/**
 * description TODO
 *
 * @author wangchangsheng
 * @date 2021/1/19 11:42 下午
 */
public class Translator extends Player {

    private ForeignCenter foreignCenter = new ForeignCenter();

    public Translator(String name) {
        super(name);
        foreignCenter.setName(name);
    }

    @Override
    public void attack() {
        foreignCenter.进攻();
    }

    @Override
    public void defense() {
        foreignCenter.防守();
    }

}
