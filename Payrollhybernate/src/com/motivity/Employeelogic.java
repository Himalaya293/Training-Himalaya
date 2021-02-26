package com.motivity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.motivity.Employee;

public class Employeelogic {
	
	public static void empdetails(int eid,String ename,String doj,String dob,String address,String deptcode,String desgcode,String gradecode,String salary,String pfno,String pfuan,String casualleave,String earnedleave,String sickleave) {
		Configuration cf=new Configuration();
		cf.configure("configuration.xml");
		SessionFactory sf=cf.buildSessionFactory();
        Session se=sf.openSession();
        
        Transaction tx=se.beginTransaction();
        Employee emp=new Employee();
        emp.setEid(eid);
        emp.setEname(ename);
        emp.setDoj(doj);
        emp.setDob(dob);
        emp.setAddress(address);
        emp.setDeptcode(deptcode);
        emp.setDesgcode(desgcode);
        emp.setGradecode(gradecode);
        emp.setSalary(salary);
        emp.setPfno(pfno);
        emp.setPfuan(pfuan);
        emp.setCasualleave(casualleave);
        emp.setEarnedleave(earnedleave);
        emp.setSickleave(sickleave);
        se.save(emp);
        tx.commit();
        System.out.println("details added");
	}
}
