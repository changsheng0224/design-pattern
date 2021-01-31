package com.abel.dp.abstractfactory;

/**
 * description TODO
 *
 * @author wangchangsheng
 * @date 2021/1/11 9:17 PM
 */
public class DepartmentActionSqlServer implements IDepartmentAction {

    public int saveDepartment(Department department) {
        System.out.println("SQLServer save department success");
        return 1;
    }

    public Department getDepartment(int id) {
        System.out.println("SQLServer save department success");
        return null;
    }
}
