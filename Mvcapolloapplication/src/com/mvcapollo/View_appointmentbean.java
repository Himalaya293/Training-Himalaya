package com.mvcapollo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class View_appointmentbean {
	int id;
	String patientname;
	int phone;
	String email,gender,bloodgroup,specialiazation,doa,toa,status,doctor_name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPatientname() {
		return patientname;
	}
	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
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
	public String getBloodgroup() {
		return bloodgroup;
	}
	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}
	public String getSpecialiazation() {
		return specialiazation;
	}
	public void setSpecialiazation(String specialiazation) {
		this.specialiazation = specialiazation;
	}
	public String getDoa() {
		return doa;
	}
	public void setDoa(String doa) {
		this.doa = doa;
	}
	public String getToa() {
		return toa;
	}
	public void setToa(String toa) {
		this.toa = toa;
	}
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
	public ArrayList<View_appointmentbean> viewvalidate(String specialiazation) throws ClassNotFoundException, SQLException {
		Connection con=ConnectionEx.Connectivity();
		PreparedStatement ps=null;
		ps=con.prepareStatement("select * from appointment where specialiazation=?");
		ps.setString(1,specialiazation);
		ResultSet rs=ps.executeQuery();
		ArrayList<View_appointmentbean> al=new ArrayList<>();
		while(rs.next()){
			View_appointmentbean vb=new View_appointmentbean();
			
			vb.setId(rs.getInt(1));
			vb.setPatientname(rs.getString(2));
			vb.setPhone(rs.getInt(3));
			vb.setEmail(rs.getString(4));
			vb.setGender(rs.getString(5));
			vb.setBloodgroup(rs.getString(6));
			vb.setSpecialiazation(rs.getString(7));
			vb.setDoa(rs.getString(8));
			vb.setToa(rs.getString(9));
			vb.setStatus(rs.getString(10));
			vb.setDoctor_name(rs.getString(11));
			al.add(vb);
		}
		return al;
	}


}
