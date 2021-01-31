package com.abel.dp.singleton;

/**
 * description TODO
 *
 * @author wangchangsheng
 * @date 2021/1/17 8:04 下午
 */
public class SingletonTest {
    public final static int num = 10;

    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[num];

        for (int i = 0; i < num; i++) {
            Login login = new Login();
            login.setLoginName("" + String.format("%2s", (i + 1)) + "号用户");
            threads[i] = new Thread(login);
            threads[i].start();
        }
        for (int i = 0; i < threads.length; i++) {
            threads[i].join();
        }

        System.out.println("网站共有"+SingletonLazy.getInstance().getCount()+"个用户登录");
    }
}
