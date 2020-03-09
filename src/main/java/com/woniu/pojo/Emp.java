package com.woniu.pojo;

public class Emp {
    private Integer empid;

    private Integer deptid;

    private String ename;

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

	@Override
	public String toString() {
		return "Emp [empid=" + empid + ", deptid=" + deptid + ", ename=" + ename + "]";
	}
    
    
}