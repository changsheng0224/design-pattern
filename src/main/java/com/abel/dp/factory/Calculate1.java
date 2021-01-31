package com.abel.dp.factory;

import java.util.Scanner;

/**
 * description 菜鸟实现一个简单的计算器
 *
 * @author wangchangsheng
 * @date 2021/1/10 9:22 PM
 */
public class Calculate1 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("请输入数字A：");
        String numberA = cin.next();
        System.out.println("请输入运算符（+，-，*，/）:");
        char op = cin.next().charAt(0);
        System.out.println("请输入数字B");
        String numberB = cin.next();
        String rst = null;
        if (op == '+') {
            rst = String.valueOf(Integer.parseInt(numberA) + Integer.parseInt(numberB));
        }
        if (op == '-') {
            rst = String.valueOf(Integer.parseInt(numberA) - Integer.parseInt(numberB));
        }
        if (op == '*') {
            rst = String.valueOf(Integer.parseInt(numberA) * Integer.parseInt(numberB));
        }
        if (op == '/') {
            rst = String.valueOf(Integer.parseInt(numberA) / Integer.parseInt(numberB));
        }
        System.out.println("结果是：" + rst);
    }
}
/**
 * 1。 判断分支意味着 做了四次匹配
 * 2。 "/" 中如果除数为零
 */