package com.abel.dp.adapter.demo1;

import org.junit.Test;

/**
 * description TODO
 *
 * @author wangchangsheng
 * @date 2021/1/19 11:19 下午
 */
public class AdapterClient {
    @Test
    public static void main(String[] args) {
        Target target;
        target = new Adapter();
        target.request();
    }
}
