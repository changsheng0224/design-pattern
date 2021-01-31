package com.abel.dp.prototype;

/**
 * description TODO
 *
 * @author wangchangsheng
 * @date 2021/1/18 9:49 下午
 */
public class Resume1 implements Cloneable {
    private String name;
    private String sex;
    private String age;
    private String timeArea;
    private String company;
    public Resume1(String name) {
        this.name = name;
    }

    //设置个人信息
    public void setPersonalInfo(String sex, String age) {
        this.sex = sex;
        this.age = age;
    }

    //设置工作经历
    public void setWorkExperience(String timeArea, String company) {
        this.timeArea = timeArea;
        this.company = company;
    }
    //显示
    public void Display() {
        System.out.println(name + " " + sex + " " + age);
    }
}
