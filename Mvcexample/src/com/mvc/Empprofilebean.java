package com.mvc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;

public class Empprofilebean {

	private String name,email,password,gender,joiningdate,department,exp;
	private int id;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getJoiningdate() {
		return joiningdate;
	}

	public void setJoiningdate(String joiningdate) {
		this.joiningdate = joiningdate;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getExp() {
		return exp;
	}

	public void setExp(String exp) {
		this.exp = exp;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public Eregistrationbean profilevalidate(int id,String name,String email,String password,String gender,String joiningdate,String department,String exp) throws ClassNotFoundException, SQLException {
		Connection con=ConnectionEx.Connectivity();
		PreparedStatement ps=con.prepareStatement("update employee set name=?,email=?,gender=?,joiningdate=?,department=?,exp=? where id=?");
		ps.setString(1,name);
		ps.setString(2,email);
		ps.setString(3,password);
		ps.setString(4,gender);
		ps.setString(5,joiningdate);
		ps.setString(6,department);
		ps.setString(7,exp);
		
		Eregistrationbean eb=new Eregistrationbean();
		
		int x=ps.executeUpdate();
		if(x!=0){
			      eb.setName(name);
			      eb.setEmail(email);
			      eb.setPassword(password);
			      eb.setGender(gender);
			      eb.setJoiningdate(joiningdate);
			      eb.setDepartment(department);
			      eb.setExp(exp);
			      return eb;
			}
		else{
				return null;
		}
		
		
	}
}
