package com.motivity;

import java.util.HashSet;
import java.util.Set;
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
        std.setSid(104);
        std.setSname("seema");
        std.setAddress("gnp");
        
        Laptop lp=new Laptop();
        lp.setLid(104);
        lp.setLname("lenovo");
        lp.setLcode("AXP52");
        
        
        Set<Student> set=new HashSet<Student>();
        set.add(std);
        lp.setStudent(set);
        
        se.save(lp);
        tx.commit();
        se.close();
	}

}
