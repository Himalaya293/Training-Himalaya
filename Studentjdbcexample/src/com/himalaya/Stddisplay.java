package com.himalaya;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Stddisplay {

	public static void sdisplay() {
		Configuration cf=new Configuration();
		cf.configure("configuration.xml");
		SessionFactory sf=cf.buildSessionFactory();
        Session se=sf.openSession();
        
        Transaction tx=se.beginTransaction();
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the choice");
	    int ch=sc.nextInt();
    	String option;
    	if(ch==1) {
    		Query qr=se.createQuery("from Student s");
			List<Student> l=qr.list();
			Iterator<Student> i=l.iterator();
			while(i.hasNext())
			{
				Student sg=i.next();
				System.out.println("Student id="+sg.getId()+"\nStudent Name= "+sg.getName()+"\nMarks= "+sg.getMarks()+"\nAddress= "+sg.getAddress()+"\nSchool_Name= "+sg.getSchool_name());	
			}
    	}
    	else if(ch==2) {
    			System.out.println("Enter the record to be displayed");
    			int x=sc.nextInt();
    			Student s=se.load(Student.class, x);
    			System.out.println("Student id="+s.getId()+"\nStudent Name= "+s.getName()+"\nMarks= "+s.getMarks()+"\nAddress= "+s.getAddress()+"\nSchool_Name= "+s.getSchool_name());
    	}
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
