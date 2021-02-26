package com.motivity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Emp_profile_updatebean {
           public static boolean update(Employee epy) {
        	   
        	   SessionFactory sf=new Configuration().configure("configuration.xml").buildSessionFactory();
               Session se=sf.openSession();
               
               Transaction tx=se.beginTransaction();
               se.update(epy);
               tx.commit();
			return true;
        	   
           }
}
