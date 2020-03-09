package com.woniu.pojo;

public class Autocade {
    private Integer acid;

    private String acnumber;

    public Integer getAcid() {
        return acid;
    }

    public void setAcid(Integer acid) {
        this.acid = acid;
    }

    public String getAcnumber() {
        return acnumber;
    }

    public void setAcnumber(String acnumber) {
        this.acnumber = acnumber == null ? null : acnumber.trim();
    }
}