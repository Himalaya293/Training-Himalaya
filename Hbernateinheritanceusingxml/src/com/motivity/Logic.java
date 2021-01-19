package com.motivity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Logic {

	public static void main(String[] args) {
		
		
		Configuration cf=new Configuration();
		cf.configure("hibernate.cfg.xml");
		SessionFactory sf=cf.buildSessionFactory();
        Session se=sf.openSession();
        
        Transaction tx=se.beginTransaction();
        
        Cheque cd=new Cheque();
        cd.setPaymentid(101);
        cd.setAmount(50000);
        cd.setChequetype("ICICI");
       
        
        
        se.save(cd);
        tx.commit();
        se.close();
        
        
	}


}
