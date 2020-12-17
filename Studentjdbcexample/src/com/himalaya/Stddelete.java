package com.himalaya;

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
        
        Transaction tx=se.beginTransaction();
        Scanner sc=new Scanner(System.in);
    	
    	String option;
    		do {
    			Query qr=se.createQuery("delete from Student s where s.id=:x");
    			System.out.println("Enter the id of the student whose record to be updated ");
				qr.setParameter("x",sc.nextInt());
				int y=qr.executeUpdate();
    			
    		if(y>=0) {
    			System.out.println("Record deleted");}
    		System.out.println("Do You Want To Continue(y/n)?");
    		option=sc.next();
    		if(option.equalsIgnoreCase("n")) {System.out.print("enter the choice");int choice=sc.nextInt();
    		//if(choice==1) {preinsert.assigninsert(con);}
    		//if(choice==2) {predisplay.assigndisplay(con);}

   		 if(choice==3) {Stdupdate.supdate();}
   		else if(choice==4) {Stddelete.sdelete();}
   		else if(choice>=5) {Exit.sexit();}
    		}
    	}
    	while(true);
	}
}
