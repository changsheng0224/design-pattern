package com.abel.dp.singleton;

/**
 * description 登陆线程
 *
 * @author wangchangsheng
 * @date 2021/1/17 8:05 下午
 */
public class Login implements Runnable {
    // 登陆名称
    private String loginName;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    @Override
    public void run() {
        SingletonLazy lazy = SingletonLazy.getInstance();
        lazy.setCount();
        System.out.println(getLoginName() + "登陆成功：" + lazy);
    }
}
