package com.abel.dp.abstractfactory;

/**
 * description TODO
 *
 * @author wangchangsheng
 * @date 2021/1/11 9:10 PM
 */
public class MysqlFactoryConcrete implements IFactoryAbstract {

    public IUserAction createUserAction() {
        return new UserActionMysql();
    }

    public IDepartmentAction createDepartmentAction() {
        return new DepartmentActionMysql();
    }

}
