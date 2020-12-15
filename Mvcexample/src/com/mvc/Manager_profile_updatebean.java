package com.mvc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Manager_profile_updatebean {
	String name,email,exp,salary,manager;
	int age,id;
	
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
	public String getExp() {
		return exp;
	}
	public void setExp(String exp) {
		this.exp = exp;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Registrationbean mpuvalidate(String name,String email,String exp,int age,String salary,String manager,int id) throws ClassNotFoundException, SQLException {
		Connection con=ConnectionEx.Connectivity();
		 PreparedStatement ps=con.prepareStatement("update manager set name=?,email=?,exp=?,age=?,salary=?,manager=? where id=?");
		 ps.setString(1,name);
		 ps.setString(2,email);
		 ps.setString(3,exp);
		 ps.setInt(4,age);
		 ps.setString(5,salary);
		 ps.setString(6,manager);
		 ps.setInt(7,id);
		 int x=ps.executeUpdate();
		 Registrationbean lb=new Registrationbean();
		 if(x!=0)
		 {
			    String sql="select * from manager where id=?";
		    	ps=con.prepareStatement(sql);
		    	ps.setInt(1,id);
		    	ResultSet rs=ps.executeQuery();
	            if(rs.next()) {
				lb.setName(rs.getString("name"));
				lb.setEmail(rs.getString("email"));
				lb.setExp(rs.getString("exp"));
				lb.setAge(rs.getInt("age"));
				lb.setSalary(rs.getString("salary"));
				lb.setManager(rs.getString("manager"));
				lb.setId(rs.getInt("id"));
		    	return lb;}
	            else {return null;}
		    }else {
		    	return null; 
		 }
	}

}
