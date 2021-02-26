package com.motivity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="laptop")
public class Laptop {
	
	@Id
	@Column(name="sid")
	private int sid;
	
	@Column(name="lid")
	private int lid;

	@Column(name="lname")
	private String lname;
	
	@Column(name="lcode")
	private String lcode;
	
	private Student student;
	public Student getStudent() {
		return student;
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
