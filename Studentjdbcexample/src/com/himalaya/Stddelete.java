package com.himalaya;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;



public class Stddelete {
	public static void sdelete() {
		Configuration cf=new Configuration();
		cf.configure("configuration.xml");
		SessionFactory sf=cf.buildSessionFactory();
        Session se=sf.openSession();
           
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the choice");
	    int ch=sc.nextInt();
    	String option;
    	if(ch==1)
    		{
    		    Transaction tx=se.beginTransaction();
    			Query qr=se.createQuery("delete from Student s where s.id=:x");
    			System.out.println("Enter the id of the student whose record to be deleted ");
				qr.setParameter("x",sc.nextInt());
				int a=qr.executeUpdate();
				tx.commit();
    			if(a==1) {System.out.println("only x Record deleted");}
    		}
    	else if(ch>=2)
    	{
		    Transaction tx=se.beginTransaction();
			Query qr=se.createQuery("delete from Student s");
			int a=qr.executeUpdate();
			tx.commit();
			if(a==1) {System.out.println("all the records in a deleted");}
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

