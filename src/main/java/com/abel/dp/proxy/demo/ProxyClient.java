package com.abel.dp.proxy.demo;

/**
 * description TODO
 *
 * @author wangchangsheng
 * @date 2021/1/25 8:46 下午
 */
public class ProxyClient {
    public static void main(String[] args) {
        Subject proxySubject = new ProxySubject();
        proxySubject.Request();
    }
}
