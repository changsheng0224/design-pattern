package com.abel.dp.abstractfactory;

/**
 * description 工厂类中的一个组成
 *
 * @author wangchangsheng
 * @date 2021/1/11 9:07 PM
 */
public class UserActionMysql implements IUserAction {

    @Override
    public int saveUser(User user) {
        System.out.println("Mysql save User success!");
        return 0;
    }

    @Override
    public IUserAction getUser(int id) {
        System.out.println("Mysql get user success!");
        return null;
    }
}
