package com.himalaya;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Getlogic {

	public static void main(String[] args) {
		Configuration cf=new Configuration();
		cf.configure("configuration.xml");
		SessionFactory sf=cf.buildSessionFactory();
        Session se=sf.openSession();
        Transaction tx=se.beginTransaction();
        Student hima=se.get(Student.class, 124);
       System.out.println(hima.getName()+hima.getMarks()+hima.getAddress()+hima.getSchool_name()+hima.getId());
       
        tx.commit();
        se.close();
        sf.close();

	}

}
