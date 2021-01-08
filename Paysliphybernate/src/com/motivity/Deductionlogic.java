package com.motivity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Deductionlogic {
	
	public Deduction deductdetails(int eid,String year,String month,String ename,String deptcode,String desgcode,String pfamount,String proftax,String incometax) {
		
		SessionFactory sf=new Configuration().configure("configuration.xml").buildSessionFactory();
        Session se=sf.openSession();
        
        Transaction tx=se.beginTransaction();
        Deduction deduct=new Deduction();
        deduct.setEid(eid);
        deduct.setYear(year);
        deduct.setMonth(month);
        deduct.setEname(ename);
        deduct.setDeptcode(deptcode);
        deduct.setDesgcode(desgcode);
        deduct.setPfamount(pfamount);
        deduct.setProftax(proftax);
        deduct.setIncometax(incometax);
        se.save(deduct);
        tx.commit();
        System.out.println("details added");
		return deduct;
	}

}
