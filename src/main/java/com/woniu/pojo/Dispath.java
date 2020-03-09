package com.woniu.pojo;

import java.util.Date;

public class Dispath {
    private Integer empid;

    private Integer driverid;

    private Integer deptid;

    private Integer cid;

    private String dpid;

    private Date start;

    private Date end;

    private String cause;

    private String address;

    private String isgone;
    
    private Emp emp;
    private Driver driver;
    private Car car;
    private Dept dept;
    
    

    public Emp getEmp() {
		return emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public Integer getDriverid() {
        return driverid;
    }

    public void setDriverid(Integer driverid) {
        this.driverid = driverid;
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getDpid() {
        return dpid;
    }

    public void setDpid(String dpid) {
        this.dpid = dpid == null ? null : dpid.trim();
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause == null ? null : cause.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getIsgone() {
        return isgone;
    }

    public void setIsgone(String isgone) {
        this.isgone = isgone == null ? null : isgone.trim();
    }

	@Override
	public String toString() {
		return "Dispath [empid=" + empid + ", driverid=" + driverid + ", deptid=" + deptid + ", cid=" + cid + ", dpid="
				+ dpid + ", start=" + start + ", end=" + end + ", cause=" + cause + ", address=" + address + ", isgone="
				+ isgone + ", emp=" + emp + ", driver=" + driver + ", car=" + car + ", dept=" + dept + "]";
	}
    
    
}