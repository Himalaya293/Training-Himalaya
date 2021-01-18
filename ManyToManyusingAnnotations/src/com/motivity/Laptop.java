package com.motivity;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="laptop")
public class Laptop {
	
	@Id
	@Column(name="lid")
	private int lid;
	
	@Column(name="lname")
	private String lname;
	
	@Column(name="lcode")
	private String lcode;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="std_id",referencedColumnName="sid")
	
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
