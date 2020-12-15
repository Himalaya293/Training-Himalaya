package com.mvcapollo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Doctor_profile_updatebean {
	private int id;
    private String name,email,phone,specialiazation;
	
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSpecialiazation() {
		return specialiazation;
	}

	public void setSpecialiazation(String specialiazation) {
		this.specialiazation = specialiazation;
	}

	public Dregistrationbean dpuvalidate(String name,String email,String phone,String specialiazation,int id) throws ClassNotFoundException, SQLException {
		Connection con=ConnectionEx.Connectivity();
		PreparedStatement ps=con.prepareStatement("update doctor set name=?,email=?,phone=?,specialiazation=? where id=?");	
		ps.setString(1, name);
		ps.setString(2,email);
		ps.setString(3,phone);
		ps.setString(4,specialiazation);
		ps.setInt(5,id);
	    int x=ps.executeUpdate();
	    Dregistrationbean lb=new Dregistrationbean();
	    if(x!=0)
	    {
	    	String sql="select * from doctor where id=?";
	    	ps=con.prepareStatement(sql);
	    	ps.setInt(1,id);
	    	ResultSet rs=ps.executeQuery();
	    	if(rs.next()) {
	    		lb.setId(rs.getInt("id"));
	    		lb.setName(rs.getString("name"));
	    		lb.setEmail(rs.getString("email"));
	    		lb.setPhone(rs.getString("phone"));
	    		lb.setSpecialiazation(rs.getString("specialiazation"));
	    		return lb;
	    	}else {
		    	return null;
		    }
	    	
	    }else {
	    	return null;
	    }
		
		
	}

}
