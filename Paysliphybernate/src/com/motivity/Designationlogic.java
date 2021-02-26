package com.motivity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Designationlogic {
	
	public Designation desgdetails(int eid,String deptcode,String desgcode,String desgname) {
		
		SessionFactory sf=new Configuration().configure("configuration.xml").buildSessionFactory();
        Session se=sf.openSession();
        
        Transaction tx=se.beginTransaction();
        Designation des=new Designation();
        des.setEid(eid);
        des.setDeptcode(deptcode);
        des.setDeptcode(desgcode);
        des.setDesgname(desgname);

        se.save(des);
        tx.commit();
        System.out.println("details added");
		return des;
    }

}
