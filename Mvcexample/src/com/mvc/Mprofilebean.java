package com.mvc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Mprofilebean {
	private String name,email,password,exp,salary,manager;
	int id,age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
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
	public String getExp() {
		return exp;
	}
	public void setExp(String exp) {
		this.exp = exp;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
	public Registrationbean profilevalidate(int id,String name,String email,String password,String exp,int age,String salary,String manager) throws ClassNotFoundException, SQLException {
		Connection con=ConnectionEx.Connectivity();
		PreparedStatement ps=con.prepareStatement("update manager set name=?,email=?,password=?,exp=?,age=?,salary=?,manager=? where id=?");
		ps.setInt(1, id);
		ps.setString(2,name);
		ps.setString(3,email);
		ps.setString(4,password);
		ps.setString(5,exp);
		ps.setInt(6,age);
		ps.setString(7,salary);
		ps.setString(8,manager);
		
		Registrationbean lb=new Registrationbean();
		
		int x=ps.executeUpdate();
		if(x!=0){
			      lb.setId(id);
			      lb.setName(name);
			      lb.setEmail(email);
			      lb.setPassword(password);
			      lb.setExp(exp);
			      lb.setAge(age);
			      lb.setSalary(salary);
			      lb.setManager(manager);
			      return lb;
			}
		else{
				return null;
		}
		
		
	}
}
