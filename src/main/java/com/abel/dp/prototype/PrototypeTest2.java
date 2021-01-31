package com.abel.dp.prototype;

/**
 * description TODO
 *
 * @author wangchangsheng
 * @date 2021/1/18 11:14 下午
 */
public class PrototypeTest2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Resume2 a = new Resume2("大鸟");
        a.SetPersonalInfo("男", "29");
        a.SetWorkExperience("1998-2000", "XX公司");

        Resume2 b = (Resume2) a.Clone();
        b.SetWorkExperience("1998-2006", "YY企业");

        Resume2 c = (Resume2) a.Clone();
        c.SetPersonalInfo("男", "24");

        a.Display();
        b.Display();
        c.Display();

    }
}
