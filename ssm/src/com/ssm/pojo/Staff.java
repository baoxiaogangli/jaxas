package com.ssm.pojo;

import java.io.Serializable;

public class Staff implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String ename;
	private String job;
	private String dname;
	private String loc;
	private double sal;
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public Staff() {
		
	}
	
	
	
}
