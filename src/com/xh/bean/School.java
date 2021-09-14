package com.xh.bean;

import java.io.Serializable;
import java.util.List;

/**
 * school
 * @author 
 */
public class School implements Serializable {
    private Integer scid;

    private String schoolname;

    private static final long serialVersionUID = 1L;

    public Integer getScid() {
        return scid;
    }

    public void setScid(Integer scid) {
        this.scid = scid;
    }

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }
    //多对多！！！
    private List<Clazz> clazzList;
    private List<Student> studentList;
    //多对多！！！ 也要写 多方的 实体类的 集合. 注意不是中间表的
    private List<Job> jobList;

    public List<Job> getJobList() {
        return jobList;
    }

    public void setJobList(List<Job> jobList) {
        this.jobList = jobList;
    }

    @Override
    public String toString() {
        return "School{" +
                "scid=" + scid +
                ", schoolname='" + schoolname + '\'' +
                ", clazzList=" + clazzList +
                ", studentList=" + studentList +
                ", jobList=" + jobList +
                '}';
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public List<Clazz> getClazzList() {
        return clazzList;
    }

    public void setClazzList(List<Clazz> clazzList) {
        this.clazzList = clazzList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        School other = (School) that;
        return (this.getScid() == null ? other.getScid() == null : this.getScid().equals(other.getScid()))
            && (this.getSchoolname() == null ? other.getSchoolname() == null : this.getSchoolname().equals(other.getSchoolname()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getScid() == null) ? 0 : getScid().hashCode());
        result = prime * result + ((getSchoolname() == null) ? 0 : getSchoolname().hashCode());
        return result;
    }

}