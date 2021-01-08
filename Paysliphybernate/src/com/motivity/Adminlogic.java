package com.motivity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Adminlogic {
	
public Admin admin_details(int aid,String aname,String emailid,String password,String phone,String doj,String dob,String address) {
		
		SessionFactory sf=new Configuration().configure("configuration.xml").buildSessionFactory();
        Session se=sf.openSession();
        
        Transaction tx=se.beginTransaction();
        Admin ad=new Admin();
        ad.setAid(aid);
        ad.setAname(aname);
        ad.setEmailid(emailid);
        ad.setPassword(password);
        ad.setPhone(phone);
        ad.setDoj(doj);
        ad.setDob(dob);
        ad.setAddress(address);
        
        se.save(ad);
        tx.commit();
        System.out.println("details added");
		return ad;
        
   }
}
