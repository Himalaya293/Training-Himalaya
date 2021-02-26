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
        
        Student std=new Student();
        std.setSid(120);
        std.setSname("laya");
        std.setAddress("hyd");
        std.setLaptop("DELL");
       
        Laptop lp=new Laptop();
        lp.setLid(120);
        lp.setLname("DELL");
        lp.setLcode("AXP12");
        
        std.setLaptop(lp);
        lp.setStudent(std);
        
        se.save(std);
        tx.commit();
        se.close();

	}

}
