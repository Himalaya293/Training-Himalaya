package com.motivity;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Greportlogic {

	public static List<Grade> gdetails() {
		SessionFactory sf=new Configuration().configure("configuration.xml").buildSessionFactory();
        Session se=sf.openSession();
        Transaction tx=se.beginTransaction();
        
        
        Query qr=se.createQuery("from Grade g");
        List<Grade> gr=qr.list();
		tx.commit();
		if(!gr.isEmpty()) {
			return gr;
		}
		else
		return null;
	}
	public static List<Employee> gedetails(int eid) {
		SessionFactory sf=new Configuration().configure("configuration.xml").buildSessionFactory();
        Session se=sf.openSession();
        Transaction tx=se.beginTransaction();
        
        
        Query qr=se.createQuery("from Employee e");
        qr.setParameter("Eid", eid);
        List<Employee> gr=qr.list();
		tx.commit();
		if(gr.isEmpty()) {
			return gr;
		}
		else
		return null;
	}
}
