package com.abel.dp.abstractfactory;

/**
 * 工厂接口
 */
public interface IFactoryAbstract {

    public IUserAction createUserAction();

    public IDepartmentAction createDepartmentAction();
}
