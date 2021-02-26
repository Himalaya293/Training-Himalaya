package com.motivity;

public class Laptop {
	 
	private int sid,lid;

	private String lname,lcode;
	private Student Student;
	public Student getStudent() {
		return Student;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
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
	public void setStudent(Student std) {
		// TODO Auto-generated method stub
		
	}
	

}
