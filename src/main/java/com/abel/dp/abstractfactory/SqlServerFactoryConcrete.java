package com.abel.dp.abstractfactory;

/**
 * description TODO
 *
 * @author wangchangsheng
 * @date 2021/1/11 9:11 PM
 */
public class SqlServerFactoryConcrete implements IFactoryAbstract {

    public IUserAction createUserAction() {
        return new UserActionSqlServer();
    }

    public IDepartmentAction createDepartmentAction() {
        return new DepartmentActionSqlServer();
    }
}
