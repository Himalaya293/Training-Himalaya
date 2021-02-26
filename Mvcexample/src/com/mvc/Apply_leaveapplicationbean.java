package com.mvc;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Apply_leaveapplicationbean {
	private String name,email,reason,doa,doj,department,status,manager_name;
    public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getManager_name() {
		return manager_name;
	}

	public void setManager_name(String manager_name) {
		this.manager_name = manager_name;
	}
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

    public String getDepartment() {
    	return department;
    }

    public void setDepartment(String department) {
    	this.department = department;
    }  
    public int getId() {
    	return id;
    }

    public void setId(int id) {
    	this.id = id;
    }
 public boolean leavevalidate(String name,String email,String reason,String doa,String doj,String department,int id) throws ClassNotFoundException, SQLException {
	 Connection con=ConnectionEx.Connectivity();
	 PreparedStatement ps=con.prepareStatement("insert into leaveapplication(name,email,reason,doa,doj,department,id) values(?,?,?,?,?,?,?)");
	 
	 ps.setString(1,name);
	 ps.setString(2, email);
	 ps.setString(3, reason);
	 ps.setString(4, doa);
	 ps.setString(5, doj);
	 ps.setString(6, department);
	 ps.setInt(7,id);
	 int x=ps.executeUpdate();
	    if(x!=0)
	    {
	    	return true;
	    }else {
	    	return false;
	    }
		 
 }
 public List<Apply_leaveapplicationbean> status(int id) throws ClassNotFoundException, SQLException{
		Connection con=ConnectionEx.Connectivity();
		PreparedStatement ps=con.prepareStatement("select * from leaveapplication where id=?");
		ps.setInt(1,id);
		ResultSet rs=ps.executeQuery();
		ArrayList<Apply_leaveapplicationbean> l=new ArrayList<>();
		while(rs.next()){
			Apply_leaveapplicationbean vb=new Apply_leaveapplicationbean();
			
			vb.setName(rs.getString(2));
			vb.setEmail(rs.getString(3));
			vb.setReason(rs.getString(4));
			vb.setDoa(rs.getString(5));
			vb.setDoj(rs.getString(6));
			vb.setDepartment(rs.getString(7));
			vb.setStatus(rs.getString(8));
			vb.setManager_name(rs.getString(9));
			l.add(vb);
		}
		return l;
		
	}

}
