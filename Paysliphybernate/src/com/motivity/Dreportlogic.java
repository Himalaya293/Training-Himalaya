package com.motivity;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Dreportlogic {

	public static List<Department> ddetails() {
		SessionFactory sf=new Configuration().configure("configuration.xml").buildSessionFactory();
        Session se=sf.openSession();
        Transaction tx=se.beginTransaction();
        
        Query qr=se.createQuery("from Department d");
        List<Department> dr=qr.list();
		tx.commit();
		if(!dr.isEmpty()) {
			return dr;
		}
		else
		return null;
	}
}
