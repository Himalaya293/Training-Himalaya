package com.mvcapollo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Patient_profile_updatebean {
	private String name,email,bloodgroup,prescription;
    private int id,age;
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
	public String getBloodgroup() {
		return bloodgroup;
	}
	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPrescription() {
		return prescription;
	}
	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Pregistrationbean ppuvalidate(String name,String email,String bloodgroup,int age,String prescription,int id) throws ClassNotFoundException, SQLException {
		Connection con=ConnectionEx.Connectivity();
		PreparedStatement ps=con.prepareStatement("update patient set name=?,email=?,bloodgroup=?,age=?,prescription=? where id=?");	
		ps.setString(1, name);
		ps.setString(2, email);
		ps.setString(3,bloodgroup);
		ps.setInt(4,age);
		ps.setString(5,prescription);
		ps.setInt(6,id);
	    int x=ps.executeUpdate();
	    Pregistrationbean eb=new Pregistrationbean();
	    if(x!=0)
	    {
            String sql="select * from patient where id=?";
	    	ps=con.prepareStatement(sql);
	    	ps.setInt(1,id);
	    	ResultSet rs=ps.executeQuery();
            if(rs.next()) {
			eb.setName(rs.getString("name"));
			eb.setEmail(rs.getString("email"));
			eb.setBloodgroup(rs.getString("bloodgroup"));
			eb.setAge(rs.getInt("age"));
			eb.setPrescription(rs.getString("prescription"));
			eb.setId(rs.getInt("id"));
	    	return eb;}
            else {return null;}
	    }else {
	    	return null;
	    }
		
	}

}
