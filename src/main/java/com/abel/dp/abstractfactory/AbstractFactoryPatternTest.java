package com.abel.dp.abstractfactory;

/**
 * description 测试主函数
 *
 * @author wangchangsheng
 * @date 2021/1/11 10:34 下午
 */
public class AbstractFactoryPatternTest {
    public static void main(String[] args) {
        User user = new User();
        Department department = new Department();

        IFactoryAbstract factoryConcrete = new MysqlFactoryConcrete();
        IUserAction userAction = factoryConcrete.createUserAction();
        userAction.saveUser(user);
        IDepartmentAction departmentAction = factoryConcrete.createDepartmentAction();
        departmentAction.saveDepartment(department);

        System.out.println(">>>>>>>>>>>>");

        IFactoryAbstract factoryConcrete2 = new SqlServerFactoryConcrete();
        IUserAction userAction2 = factoryConcrete2.createUserAction();
        userAction2.saveUser(user);
        IDepartmentAction departmentAction2 = factoryConcrete2.createDepartmentAction();
        departmentAction2.saveDepartment(department);

    }
}
