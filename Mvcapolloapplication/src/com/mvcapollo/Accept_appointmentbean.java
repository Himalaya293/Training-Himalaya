package com.mvcapollo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Accept_appointmentbean {

	int id;
	String status,doctor_name;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDoctor_name() {
		return doctor_name;
	}
	public void setDoctor_name(String doctor_name) {
		this.doctor_name = doctor_name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	 public boolean acceptvalidate(String doctor_name,int id) throws ClassNotFoundException, SQLException {
		  Connection con=ConnectionEx.Connectivity();
		  PreparedStatement ps=con.prepareStatement("update appointment set status=?,doctor_name=? where id=?");	
		  ps.setString(1,"Accepted");
		  ps.setString(2,doctor_name);
		  ps.setInt(3,id);
		  int x=ps.executeUpdate();
		  if(x!=0) {
			  return true;
			  }else {
				  return false;
		  }
	  }
	
}
