package com.mvc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.http.HttpSession;


public class View_applibean {
	
	String name,email,reason,doa,doj,status,department,manager_name,manager;
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

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getDoa() {
		return doa;
	}

	public void setDoa(String doa) {
		this.doa = doa;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String getManager_name() {
		return manager_name;
	}

	public void setManager_name(String manager_name) {
		this.manager_name = manager_name;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<View_applibean> viewvalidate(String department) throws ClassNotFoundException, SQLException {
		Connection con=ConnectionEx.Connectivity();
		PreparedStatement ps=null;
		ps=con.prepareStatement("select * from leaveapplication where department=?");
		ps.setString(1,department);
		ResultSet rs=ps.executeQuery();
		ArrayList<View_applibean> al=new ArrayList<>();
		while(rs.next()){
			View_applibean vb=new View_applibean();
			
			vb.setId(rs.getInt(1));
			vb.setName(rs.getString(2));
			vb.setEmail(rs.getString(3));
			vb.setReason(rs.getString(4));
			vb.setDoa(rs.getString(5));
			vb.setDoj(rs.getString(6));
			vb.setDepartment(rs.getString(7));
			vb.setStatus(rs.getString(8));
			vb.setManager_name(rs.getString(9));
			al.add(vb);
		}
		return al;
	}

}
