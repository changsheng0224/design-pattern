package com.abel.dp.prototype;

/**
 * description TODO
 *
 * @author wangchangsheng
 * @date 2021/1/18 11:25 下午
 */
public class PrototypeTest4 {

    public static void main(String[] args) throws CloneNotSupportedException {

        Resume4 a = new Resume4("大鸟");
        a.SetPersonalInfo("男", "29");
        a.SetWorkExperience("1998-2000", "XX公司");

        Resume4 b = (Resume4) a.Clone();
        b.SetWorkExperience("1998-2006", "YY企业");

        Resume4 c = (Resume4) a.Clone();
        c.SetPersonalInfo("男", "24");
        c.SetWorkExperience("1998-2004", "ZZ企业");

        a.Display();
        b.Display();
        c.Display();

    }
}
