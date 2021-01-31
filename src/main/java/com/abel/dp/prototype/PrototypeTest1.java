package com.abel.dp.prototype;

/**
 * description TODO
 *
 * @author wangchangsheng
 * @date 2021/1/18 11:02 下午
 */
public class PrototypeTest1 {
    public static void main(String[] args) {
        Resume1 a = new Resume1("大鸟");
        a.setPersonalInfo("男", "21");
        a.setWorkExperience("2020-2021", "XX公司");
        Resume1 b = a;
        Resume1 c = a;

        a.Display();
        b.Display();
        c.Display();
    }
}
