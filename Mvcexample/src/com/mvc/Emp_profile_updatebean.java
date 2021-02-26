package com.mvc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Emp_profile_updatebean {
	String name,email,gender,joiningdate,department,exp;
	int id;
	
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
	public Eregistrationbean epuvalidate(String name,String email,String gender,String joiningdate,String department,String exp,int id) throws ClassNotFoundException, SQLException {
		Connection con=ConnectionEx.Connectivity();
		PreparedStatement ps=con.prepareStatement("update employee set name=?,email=?,gender=?,joiningdate=?,department=?,exp=? where id=?");
		ps.setString(1,name);
		ps.setString(2,email);
		ps.setString(3,gender);
		ps.setString(4,joiningdate);
		ps.setString(5,department);
		ps.setString(6,exp);
		ps.setInt(7,id);
		int x=ps.executeUpdate();
		Eregistrationbean eb=new Eregistrationbean();
		if(x!=0) {
			   String sql="select * from employee where id=?";
		    	ps=con.prepareStatement(sql);
		    	ps.setInt(1,id);
		    	ResultSet rs=ps.executeQuery();
	            if(rs.next()) {
				eb.setName(rs.getString("name"));
				eb.setEmail(rs.getString("email"));
				eb.setGender(rs.getString("gender"));
				eb.setJoiningdate(rs.getString("joiningdate"));
				eb.setDepartment(rs.getString("department"));
				eb.setExp(rs.getString("exp"));
				eb.setId(rs.getInt("id"));
		    	return eb;}
	            else {return null;}
		    }else {
		    	return null;		
		}

     }
}