package com.abel.dp.adapter;

/**
 * description TODO
 *
 * @author wangchangsheng
 * @date 2021/1/19 11:42 下午
 */
public class Client {

    public static void main(String[] args) {
        Player k = new Guards("科比");
        k.attack();
        Player m = new Forwards("麦迪");
        m.attack();
//        Player y = new Center("姚明");
        Player y = new Translator("姚明");
        y.attack();
        y.defense();
    }

}