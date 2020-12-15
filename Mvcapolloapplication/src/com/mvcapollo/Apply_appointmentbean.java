package com.mvcapollo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mvcapollo.ConnectionEx;

public class Apply_appointmentbean {
	private String patientname,email,gender,bloodgroup,specialiazation,doa,toa,status,doctor_name;
    Long phone;
    
	public String getPatientname() {
		return patientname;
	}    

	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
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
	public PreparedStatement appointmentvalidate(String patientname,Long phone,String email,String gender,String bloodgroup,String specialiazation,String doa,String toa) throws ClassNotFoundException, SQLException {
		 Connection con=ConnectionEx.Connectivity();
		 PreparedStatement ps=con.prepareStatement("insert into appointment(patientname,phone,email,gender,bloodgroup,specialiazation,doa,toa) values(?,?,?,?,?,?,?,?)");
		 
		 ps.setString(1, patientname);
		 ps.setLong(2, phone);
		 ps.setString(3, email);
		 ps.setString(4, gender);
		 ps.setString(5, bloodgroup);
		 ps.setString(6, specialiazation);
		 ps.setString(7, doa);
		 ps.setString(8, toa);
		 int x=ps.executeUpdate();
		 if(x!=0) 
		 {
			 return ps;
		 }else {
			 return null;
		 }
	}
	public List<Apply_appointmentbean> status(int id) throws ClassNotFoundException, SQLException{
		Connection con=ConnectionEx.Connectivity();
		PreparedStatement ps=con.prepareStatement("select * from appointment where id=?");
		ps.setInt(1,id);
		ResultSet rs=ps.executeQuery();
		ArrayList<Apply_appointmentbean> l=new ArrayList<>();
		while(rs.next()){
			Apply_appointmentbean vb=new Apply_appointmentbean();
			
			vb.setPatientname(rs.getString(2));
			vb.setPhone(rs.getLong(3));
			vb.setEmail(rs.getString(4));
			vb.setGender(rs.getString(5));
			vb.setBloodgroup(rs.getString(6));
			vb.setSpecialiazation(rs.getString(7));
			vb.setDoa(rs.getString(8));
			vb.setToa(rs.getString(9));
			vb.setStatus(rs.getString(10));
			vb.setDoctor_name(rs.getString(11));
			l.add(vb);
		}
		return l;
		
	}


}
