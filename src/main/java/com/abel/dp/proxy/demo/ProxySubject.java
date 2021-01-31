package com.abel.dp.proxy.demo;

/**
 * description TODO
 *
 * @author wangchangsheng
 * @date 2021/1/25 8:45 下午
 */
public class ProxySubject extends Subject {

    RealSubject realSubject;

    @Override
    public void Request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        realSubject.Request();
    }
}
