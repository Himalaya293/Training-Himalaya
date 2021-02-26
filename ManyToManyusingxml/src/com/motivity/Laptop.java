package com.motivity;

import java.util.List;
import java.util.Set;

public class Laptop {
	
	private int lid;
	private String lname;
	private String lcode;
	
	private Set<Student> student;
	public Set<Student> getStudent() {
		return student;
	}
	public void setStudent(Set<Student> set) {
		this.student =  set;
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getLcode() {
		return lcode;
	}
	public void setLcode(String lcode) {
		this.lcode = lcode;
	}
}
