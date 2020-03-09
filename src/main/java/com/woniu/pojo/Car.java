package com.woniu.pojo;

public class Car {
    private Integer cid;

    private String license;

    private String brand;

    private String color;

    private Integer setting;

    private String carstruts;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license == null ? null : license.trim();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    public Integer getSetting() {
        return setting;
    }

    public void setSetting(Integer setting) {
        this.setting = setting;
    }

    public String getCarstruts() {
        return carstruts;
    }

    public void setCarstruts(String carstruts) {
        this.carstruts = carstruts == null ? null : carstruts.trim();
    }

	@Override
	public String toString() {
		return "Car [cid=" + cid + ", license=" + license + ", brand=" + brand + ", color=" + color + ", setting="
				+ setting + ", carstruts=" + carstruts + ", getCid()=" + getCid() + ", getLicense()=" + getLicense()
				+ ", getBrand()=" + getBrand() + ", getColor()=" + getColor() + ", getSetting()=" + getSetting()
				+ ", getCarstruts()=" + getCarstruts() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
    
    
}