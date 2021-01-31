package com.abel.dp.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * description 树枝节点
 *
 * @author wangchangsheng
 * @date 2021/1/24 10:18 上午
 */
public class ConcreteCompany extends Company {

    private List<Company> childrenCompany = new ArrayList<Company>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
        childrenCompany.add(company);
    }

    @Override
    public void remove(Company company) {
        childrenCompany.remove(company);
    }

    @Override
    public void display(int depth) {
        System.out.println("第" + depth + "层的机构名为：" + name);
        for (Company c : childrenCompany) {
            c.display(depth + 1);
        }
    }

    @Override
    public void lineofDuty() {
        for (Company c : childrenCompany) {
            c.lineofDuty();
        }
    }
}
