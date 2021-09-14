package com.xh.bean;

import java.io.Serializable;
import java.util.List;

/**
 * student
 * @author 
 */
public class Student implements Serializable {
    private Integer stuid;

    private String studentname;

    private Integer studentjob;

    private Integer claid;

    private static final long serialVersionUID = 1L;

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public Integer getStudentjob() {
        return studentjob;
    }

    public void setStudentjob(Integer studentjob) {
        this.studentjob = studentjob;
    }

    public Integer getClaid() {
        return claid;
    }

    public void setClaid(Integer claid) {
        this.claid = claid;
    }
    // 一对多 在一里面写集合
    private List<Idcard> idcardList;

    @Override
    public String toString() {
        return "Student{" +
                "stuid=" + stuid +
                ", studentname='" + studentname + '\'' +
                ", studentjob=" + studentjob +
                ", claid=" + claid +
                ", idcardList=" + idcardList +
                '}';
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public List<Idcard> getIdcardList() {
        return idcardList;
    }

    public void setIdcardList(List<Idcard> idcardList) {
        this.idcardList = idcardList;
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
        Student other = (Student) that;
        return (this.getStuid() == null ? other.getStuid() == null : this.getStuid().equals(other.getStuid()))
            && (this.getStudentname() == null ? other.getStudentname() == null : this.getStudentname().equals(other.getStudentname()))
            && (this.getStudentjob() == null ? other.getStudentjob() == null : this.getStudentjob().equals(other.getStudentjob()))
            && (this.getClaid() == null ? other.getClaid() == null : this.getClaid().equals(other.getClaid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStuid() == null) ? 0 : getStuid().hashCode());
        result = prime * result + ((getStudentname() == null) ? 0 : getStudentname().hashCode());
        result = prime * result + ((getStudentjob() == null) ? 0 : getStudentjob().hashCode());
        result = prime * result + ((getClaid() == null) ? 0 : getClaid().hashCode());
        return result;
    }

}