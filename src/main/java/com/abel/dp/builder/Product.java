package com.abel.dp.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * description Product类，由多个对象组成
 *
 * @author wangchangsheng
 * @date 2021/1/17 9:24 下午
 */
public class Product {
    List<String> productParts = new ArrayList<String>();
    // 添加产品部件
    public void addProductParts(String productPart) {
        productParts.add(productPart);
    }

    // 列举所有的产品部件
    public void show() {
        for (String productPart:productParts) {
            System.out.println(productPart);
        }
    }
}
