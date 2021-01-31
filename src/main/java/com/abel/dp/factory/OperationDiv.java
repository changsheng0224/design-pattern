package com.abel.dp.factory;

/**
 * description 加法类
 *
 * @author wangchangsheng
 * @date 2021/1/10 10:12 PM
 */
public class OperationDiv extends Operation {

    @Override
    public double getResult() throws Exception {
        if (get_numberB() == 0) {
            throw new Exception("被除数不能为0！");
        }
        return get_numberA() / get_numberB();
    }
}
