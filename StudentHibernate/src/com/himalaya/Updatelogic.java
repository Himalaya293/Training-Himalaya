package com.himalaya;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Updatelogic {

	public static void main(String[] args) {
		Configuration cf=new Configuration();
		cf.configure("configuration.xml");
		SessionFactory sf=cf.buildSessionFactory();
        Session se=sf.openSession();
        Transaction tx=se.beginTransaction();
        Student hima=se.load(Student.class, 122);
        hima.setName("jaabi");
        se.update(hima);
        tx.commit();
        se.close();
        sf.close();

	}

}
