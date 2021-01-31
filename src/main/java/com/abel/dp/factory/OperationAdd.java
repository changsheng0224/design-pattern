package com.abel.dp.factory;

/**
 * description 加法类
 *
 * @author wangchangsheng
 * @date 2021/1/10 10:12 PM
 */
public class OperationAdd extends Operation {

    @Override
    public double getResult() {
        return get_numberA() + get_numberB();
    }
}
