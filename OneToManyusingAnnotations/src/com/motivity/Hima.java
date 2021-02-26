package com.motivity;

import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name="hima")
public class Hima {
	@Id
	@Column(name="sid")
    private int sid;
	
	@Column(name="sname")
	private String sname;
	
	@Column(name="marks")
	private String marks;
	
	@Column(name="address")
	private String address;
	
	@Column(name="school_name")
	private String school_name;
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getMarks() {
		return marks;
	}

	public void setMarks(String marks) {
		this.marks = marks;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSchool_name() {
		return school_name;
	}

	public void setSchool_name(String school_name) {
		this.school_name = school_name;
	}
	
}
