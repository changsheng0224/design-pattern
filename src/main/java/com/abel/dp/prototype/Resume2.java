package com.abel.dp.prototype;

/**
 * description TODO
 *
 * @author wangchangsheng
 * @date 2021/1/18 11:06 下午
 */
public class Resume2 implements Cloneable {
    private String name;
    private String sex;
    private String age;
    private String timeArea;
    private String company;

    public Resume2(String name)
    {
        this.name = name;
    }

    //设置个人信息
    public void SetPersonalInfo(String sex, String age)
    {
        this.sex = sex;
        this.age = age;
    }

    //设置工作经历
    public void SetWorkExperience(String timeArea, String company)
    {
        this.timeArea = timeArea;
        this.company = company;
    }

    //显示
    public void Display()
    {
        System.out.println(name+" "+sex+" "+age);
        System.out.println(timeArea+" "+company);
    }

    // 重写clone方法
    public Object Clone() throws CloneNotSupportedException {
        return (Object) super.clone();
    }
}
