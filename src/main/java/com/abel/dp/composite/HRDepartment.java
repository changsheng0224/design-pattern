package com.abel.dp.composite;

/**
 * description 树叶节点
 *
 * @author wangchangsheng
 * @date 2021/1/24 10:23 上午
 */
public class HRDepartment extends Company {

    public HRDepartment(String name) {
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
        System.out.println(name + "    负责员工招聘管理培训");
    }
}
