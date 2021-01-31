package com.abel.dp.abstractfactory;

public interface IUserAction {
    public int saveUser(User user);

    public IUserAction getUser(int id);
}
