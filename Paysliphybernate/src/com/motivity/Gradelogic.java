package com.motivity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Gradelogic {
	
	public Grade gdetails(int eid,String gradecode,String basic,String hra,String egrade) {
		
		SessionFactory sf=new Configuration().configure("configuration.xml").buildSessionFactory();
        Session se=sf.openSession();
        
        Transaction tx=se.beginTransaction();
        Grade g=new Grade();
        g.setEid(eid);
        g.setGradecode(gradecode);
        g.setBasic(basic);
        g.setHra(hra);
        g.setEgrade(egrade);

        se.save(g);
        tx.commit();
        System.out.println("details added");
		return g;
    }

}
