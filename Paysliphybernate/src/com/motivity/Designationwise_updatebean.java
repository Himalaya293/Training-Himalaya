package com.motivity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Designationwise_updatebean {
	public static boolean dsgupdate(Designation ds) {
	 	   
	 	   SessionFactory sf=new Configuration().configure("configuration.xml").buildSessionFactory();
	        Session se=sf.openSession();
	        
	        Transaction tx=se.beginTransaction();
	        se.update(ds);
	        tx.commit();
			return true;
	}
}
