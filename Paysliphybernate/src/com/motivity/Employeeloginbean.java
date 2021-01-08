package com.motivity;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Employeeloginbean {
	
	public static Employee elogin(String email,String password) {
		SessionFactory sf=new Configuration().configure("configuration.xml").buildSessionFactory();
        Session se=sf.openSession();
        
        Transaction tx=se.beginTransaction();
        Query qr=se.createQuery("from Employee a where email=:x and password=:y");
        qr.setParameter("x",email);
        qr.setParameter("y", password);
        List<Employee> l=((org.hibernate.query.Query) qr).list();
        tx.commit();
        if(!l.isEmpty()) {
        	Employee ed=l.get(0);
        	return ed;
        }
		return null;
	}	
}
