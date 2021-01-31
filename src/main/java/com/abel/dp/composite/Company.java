package com.abel.dp.composite;

/**
 * description TODO
 *
 * @author wangchangsheng
 * @date 2021/1/24 10:16 上午
 */
public abstract class Company {
    protected String name;

    public Company(String name) {
        this.name = name;
    }

    public abstract void add(Company company);

    public abstract void remove(Company company);

    public abstract void display(int depth);

    public abstract void lineofDuty();
}
