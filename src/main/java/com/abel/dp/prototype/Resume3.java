package com.abel.dp.prototype;

/**
 * description TODO
 *
 * @author wangchangsheng
 * @date 2021/1/18 11:23 下午
 */
public class Resume3 implements Cloneable {
    private String name;
    private String sex;
    private String age;

    private WorkExperience work;

    public Resume3(String name) {
        this.name = name;
        work = new WorkExperience();
    }

    //设置个人信息
    public void SetPersonalInfo(String sex, String age) {
        this.sex = sex;
        this.age = age;
    }

    //设置工作经历
    public void SetWorkExperience(String workDate, String company) {
        work.setWorkDate(workDate);
        work.setCompany(company);
    }

    //显示
    public void Display() {
        System.out.println(name + " " + sex + " " + age);
        System.out.println(work.getWorkDate() + " " + work.getCompany());
    }

    public Object Clone() throws CloneNotSupportedException {
        return (Object) super.clone();
    }
}
