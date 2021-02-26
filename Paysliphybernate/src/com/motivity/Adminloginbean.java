package com.motivity;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Adminloginbean {
	
	public static Admin adlogin(String emailid,String password) {
		SessionFactory sf=new Configuration().configure("configuration.xml").buildSessionFactory();
        Session se=sf.openSession();
        
        Transaction tx=se.beginTransaction();
        Query qr=se.createQuery("from Admin a where emailid=:x and password=:y");
        qr.setParameter("x",emailid);
        qr.setParameter("y", password);
        List<Admin> l=((org.hibernate.query.Query) qr).list();
        tx.commit();
        if(!l.isEmpty()) {
        	Admin ad=l.get(0);
        	return ad;
        }
        return null;
	}

}
