package com.abel.dp.factory;

/**
 * description 工厂模式
 *
 * @author wangchangsheng
 * @date 2021/1/10 9:06 PM
 */
public class OperationFactory {
    public static Operation createOperate(String opr) {
        // 此处 多态 功能的使用
        Operation operation = null;
        switch (opr.charAt(0)) {
            case '+':
                operation = new OperationAdd();
                break;
            case '-':
                operation = new OperationSub();
                break;
            case '*':
                operation = new OperationMul();
                break;
            case '/':
                operation = new OperationDiv();
                break;
        }
        return operation;
    }
}
