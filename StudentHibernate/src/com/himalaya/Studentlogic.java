package com.himalaya;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class Studentlogic {

	public static void main(String[] args) {
		
		Configuration cf=new Configuration();
		cf.configure("configuration.xml");
		SessionFactory sf=cf.buildSessionFactory();
        Session se=sf.openSession();
        
        Transaction tx=se.beginTransaction();
        Criteria crt=se.createCriteria(Student.class);
        Criterion cn=Restrictions.gt("marks", 90);
        crt.add(cn);
        
        List li=crt.list();
        Iterator i=li.iterator();
        while(i.hasNext()) {
        	Student s=(Student)i.next();
        	System.out.println(s.getId()+s.getName());
        }
        tx.commit();
        se.close();
        sf.close();

	}

}
