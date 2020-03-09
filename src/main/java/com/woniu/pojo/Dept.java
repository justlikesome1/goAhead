package com.woniu.pojo;

public class Dept {
    private Integer deptid;

    private String dename;

    private String dephone;

    private String destuats;

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public String getDename() {
        return dename;
    }

    public void setDename(String dename) {
        this.dename = dename == null ? null : dename.trim();
    }

    public String getDephone() {
        return dephone;
    }

    public void setDephone(String dephone) {
        this.dephone = dephone == null ? null : dephone.trim();
    }

    public String getDestuats() {
        return destuats;
    }

    public void setDestuats(String destuats) {
        this.destuats = destuats == null ? null : destuats.trim();
    }
}