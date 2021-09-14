package com.xh.bean;

import java.io.Serializable;

/**
 * clazz
 * @author 
 */
public class Clazz implements Serializable {
    private Integer clazzid;

    private String clazzname;

    private Integer schid;

    private Integer clazzjob;

    private static final long serialVersionUID = 1L;

    public Integer getClazzid() {
        return clazzid;
    }

    public void setClazzid(Integer clazzid) {
        this.clazzid = clazzid;
    }

    public String getClazzname() {
        return clazzname;
    }

    public void setClazzname(String clazzname) {
        this.clazzname = clazzname;
    }

    public Integer getSchid() {
        return schid;
    }

    public void setSchid(Integer schid) {
        this.schid = schid;
    }

    public Integer getClazzjob() {
        return clazzjob;
    }

    public void setClazzjob(Integer clazzjob) {
        this.clazzjob = clazzjob;
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
        Clazz other = (Clazz) that;
        return (this.getClazzid() == null ? other.getClazzid() == null : this.getClazzid().equals(other.getClazzid()))
            && (this.getClazzname() == null ? other.getClazzname() == null : this.getClazzname().equals(other.getClazzname()))
            && (this.getSchid() == null ? other.getSchid() == null : this.getSchid().equals(other.getSchid()))
            && (this.getClazzjob() == null ? other.getClazzjob() == null : this.getClazzjob().equals(other.getClazzjob()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getClazzid() == null) ? 0 : getClazzid().hashCode());
        result = prime * result + ((getClazzname() == null) ? 0 : getClazzname().hashCode());
        result = prime * result + ((getSchid() == null) ? 0 : getSchid().hashCode());
        result = prime * result + ((getClazzjob() == null) ? 0 : getClazzjob().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", clazzid=").append(clazzid);
        sb.append(", clazzname=").append(clazzname);
        sb.append(", schid=").append(schid);
        sb.append(", clazzjob=").append(clazzjob);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}