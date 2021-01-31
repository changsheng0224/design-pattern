package com.abel.dp.prototype;

/**
 * description TODO
 *
 * @author wangchangsheng
 * @date 2021/1/18 11:23 下午
 */
public class WorkExperience2 implements Cloneable{
    private String workDate;
    private String company;

    public String getWorkDate() {
        return workDate;
    }
    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }

    public Object Clone() throws CloneNotSupportedException
    {
        return (Object)super.clone();
    }
}
