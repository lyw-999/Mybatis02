package com.xh.bean;

import java.io.Serializable;

/**
 * job
 * @author 
 */
public class Job implements Serializable {
    private Integer jobid;

    private String jobname;

    private static final long serialVersionUID = 1L;

    public Integer getJobid() {
        return jobid;
    }

    public void setJobid(Integer jobid) {
        this.jobid = jobid;
    }

    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname;
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
        Job other = (Job) that;
        return (this.getJobid() == null ? other.getJobid() == null : this.getJobid().equals(other.getJobid()))
            && (this.getJobname() == null ? other.getJobname() == null : this.getJobname().equals(other.getJobname()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getJobid() == null) ? 0 : getJobid().hashCode());
        result = prime * result + ((getJobname() == null) ? 0 : getJobname().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", jobid=").append(jobid);
        sb.append(", jobname=").append(jobname);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}