package com.motivity;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Dsgreportlogic {

	public static List<Designation> dsgdetails() {
		SessionFactory sf=new Configuration().configure("configuration.xml").buildSessionFactory();
        Session se=sf.openSession();
        Transaction tx=se.beginTransaction();
        
        Query qr=se.createQuery("from Designation d");
        List<Designation> dgr=qr.list();
		tx.commit();
		if(!dgr.isEmpty()) {
			return dgr;
		}
		else
		return null;
	}
}
