package com.abel.dp.proxy.demo;

/**
 * description TODO
 *
 * @author wangchangsheng
 * @date 2021/1/25 8:44 下午
 */
public class RealSubject extends Subject {

    @Override
    public void Request() {
        System.out.println("真实的请求");
    }
}
