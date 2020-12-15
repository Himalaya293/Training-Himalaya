package com.mvc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Accept_leaveapplicationbean {
	
	String status,manager_name;
	int id;

	public String getStatus() {
		return status;
	}

	public void setName(String status) {
		this.status = status;
	}

	public String getManager_name() {
		return manager_name;
	}

	public void setManager_name(String manager_name) {
		this.manager_name = manager_name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
  public boolean acceptvalidate(String manager_name,int id) throws ClassNotFoundException, SQLException {
	  Connection con=ConnectionEx.Connectivity();
	  PreparedStatement ps=con.prepareStatement("update leaveapplication set status=?,manager_name=? where id=?");	
	  ps.setString(1,"Accepted");
	  ps.setString(2,manager_name);
	  ps.setInt(3,id);
	  int x=ps.executeUpdate();
	  if(x!=0) {
		  return true;
		  }else {
			  return false;
	  }
  }
}
