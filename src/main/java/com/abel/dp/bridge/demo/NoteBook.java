package com.abel.dp.bridge.demo;

/**
 * description TODO
 *
 * @author wangchangsheng
 * @date 2021/1/24 12:18 上午
 */
//笔记本电脑
public class NoteBook extends Computer {
    public NoteBook(Brand brand) {
        super(brand);
    }
    public void open(){
        super.open();
        System.out.println("笔记本电脑");
    }
    public void close(){
        super.close();
        System.out.println("笔记本电脑");
    }
    public void work(){
        super.work();
        System.out.println("笔记本电脑");
    }
}