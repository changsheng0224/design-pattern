package com.abel.dp.abstractfactory;

/**
 * description 工厂类中的 一部分
 *
 * @author wangchangsheng
 * @date 2021/1/11 9:19 PM
 */
public class UserActionSqlServer implements IUserAction {

    @Override
    public int saveUser(User user) {
        System.out.println("SQLServer save User success!");
        return 0;
    }

    @Override
    public IUserAction getUser(int id) {
        System.out.println("SQLServer get User success!");
        return null;
    }
}
