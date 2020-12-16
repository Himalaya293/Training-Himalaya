package com.himalaya;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Studentlogic {

	public static void main(String[] args) {
		
		Configuration cf=new Configuration();
		cf.configure("configuration.xml");
		SessionFactory sf=cf.buildSessionFactory();
        Session se=sf.openSession();
        Student hima=new Student();
        hima.setId(123);
        hima.setName("keerthi");
        hima.setMarks(98);
        hima.setAddress("hnr");
        hima.setSchool_name("kims");
        hima.setId(124);
        hima.setName("prashanthi");
        hima.setMarks(95);
        hima.setAddress("gnp");
        hima.setSchool_name("kims");
        Transaction tx=se.beginTransaction();
        se.save(hima);
        tx.commit();
        se.close();
        sf.close();

	}

}
