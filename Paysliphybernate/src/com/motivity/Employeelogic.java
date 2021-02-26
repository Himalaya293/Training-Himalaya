package com.motivity;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Employeelogic {
	
	public Employee empdetails(int eid,String cname,String email,String password,String address,String deptcode,String desgcode,String gradecode,String salary,String pfno,String pfuan,String casualleave,String earnedleave,String sickleave) {		
	
		SessionFactory sf=new Configuration().configure("configuration.xml").buildSessionFactory();
        Session se=sf.openSession();
        
        Transaction tx=se.beginTransaction();
        Employee emp=new Employee();
        emp.setEid(eid);
        emp.setCname(cname);
        emp.setEmail(email);
        emp.setPassword(password);
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
		return emp;
 
	}

}
