package com.abel.dp.composite;

/**
 * description TODO
 *
 * @author wangchangsheng
 * @date 2021/1/24 10:26 上午
 */
public class FinanceDepartment extends Company {

    public FinanceDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {

    }

    @Override
    public void remove(Company company) {

    }

    @Override
    public void display(int depth) {
        System.out.println("第 " + depth + " 层的机构名为： " + name);
    }

    @Override
    public void lineofDuty() {
        System.out.println(name + "   负责公司财务收支管理");
    }
}
