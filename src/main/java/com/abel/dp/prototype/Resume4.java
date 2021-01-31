package com.abel.dp.prototype;

/**
 * description TODO
 *
 * @author wangchangsheng
 * @date 2021/1/18 11:32 下午
 */
public class Resume4 implements Cloneable {

    private String name;
    private String sex;
    private String age;
    private WorkExperience2 work;

    public Resume4(String name)
    {
        this.name = name;
        work = new WorkExperience2();
    }

    private Resume4(WorkExperience2 work) throws CloneNotSupportedException
    {
        this.work = (WorkExperience2)work.Clone();
    }

    //设置个人信息
    public void SetPersonalInfo(String sex, String age)
    {
        this.sex = sex;
        this.age = age;
    }

    //设置工作经历
    public void SetWorkExperience(String workDate, String company)
    {
        work.setWorkDate(workDate);
        work.setCompany(company);
    }

    //显示
    public void Display()
    {
        System.out.println(name+" "+sex+" "+age);
        System.out.println(work.getWorkDate()+" "+work.getCompany());
    }

    public Object Clone() throws CloneNotSupportedException {
        Resume4 obj = new Resume4(this.work);
        obj.name = this.name;
        obj.sex = this.sex;
        obj.age = this.age;
        return obj;
    }

}
