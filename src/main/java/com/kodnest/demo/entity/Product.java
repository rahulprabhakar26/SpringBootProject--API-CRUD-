package com.kodnest.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
	
	@Id
	long pid;
	String pname;
	String ptxn_no;
	String pdetails;
	boolean pstatus;
	
	public Product() {
		super();
	}

	public Product(long pid, String pname, String ptxn_no, String pdetails, boolean pstatus) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.ptxn_no = ptxn_no;
		this.pdetails = pdetails;
		this.pstatus = pstatus;
	}

	public long getPid() {
		return pid;
	}

	public void setPid(long pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPtxn_no() {
		return ptxn_no;
	}

	public void setPtxn_no(String ptxn_no) {
		this.ptxn_no = ptxn_no;
	}

	public String getPdetails() {
		return pdetails;
	}

	public void setPdetails(String pdetails) {
		this.pdetails = pdetails;
	}

	public boolean isPstatus() {
		return pstatus;
	}

	public void setPstatus(boolean pstatus) {
		this.pstatus = pstatus;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", ptxn_no=" + ptxn_no + ", pdetails=" + pdetails
				+ ", pstatus=" + pstatus + "]";
	}
	
	

}
