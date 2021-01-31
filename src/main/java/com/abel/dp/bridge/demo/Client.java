package com.abel.dp.bridge.demo;

/**
 * description TODO
 *
 * @author wangchangsheng
 * @date 2021/1/24 12:18 上午
 */
public class Client {
    public static void main(String[] args) {
        //获取笔记本电脑（类型加品牌）任意组合都可以
        NoteBook noteBook = new NoteBook(new Huawei());
        noteBook.open();
        noteBook.close();
        noteBook.work();
    }
}
