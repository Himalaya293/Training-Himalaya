package com.himalaya;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Stdinsert {

	public static void sinsert() {

		Configuration cf=new Configuration();
		cf.configure("configuration.xml");
		SessionFactory sf=cf.buildSessionFactory();
        Session se=sf.openSession();
        
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the values to be inserted");
        String option;
        Transaction tx=se.beginTransaction();
        Student s=new Student();
        s.setId(124);
        s.setName("prashanthi");
        s.setMarks(95);
        s.setAddress("gnp");
        s.setSchool_name("kims");
        se.save(s);
        tx.commit();
        
		System.out.println("Do You Want To Continue(y/n)?");
		option=sc.next();
		if(option.equalsIgnoreCase("n")) {System.out.print("enter the choice");int choice=sc.nextInt();

		if(choice==1) {Stdinsert.sinsert();}
		else if(choice==2) {Stddisplay.sdisplay();}
		else if(choice==3) {Stddelete.sdelete();}
		else if(choice>=4) {Exit.sexit();}
	}

  }
}