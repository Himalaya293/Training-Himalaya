package com.motivity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;




public class Ereportlogic {

	public static List<Employee> empdetails() {		
		
		SessionFactory sf=new Configuration().configure("configuration.xml").buildSessionFactory();
        Session se=sf.openSession();
        Transaction tx=se.beginTransaction();
        
        
        Query qr=se.createQuery("from Employee e");
		List<Employee> er=qr.list();
		tx.commit();
		if(!er.isEmpty()) {
			return er;
		}
		else {
			return null;
		}
 
	}

}
