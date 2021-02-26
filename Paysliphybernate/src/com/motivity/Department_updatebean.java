package com.motivity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Department_updatebean {
	public static boolean dupdate(Department d) {
	 	   
	 	   SessionFactory sf=new Configuration().configure("configuration.xml").buildSessionFactory();
	        Session se=sf.openSession();
	        
	        Transaction tx=se.beginTransaction();
	        se.update(d);
	        tx.commit();
			return true;
	}
}
