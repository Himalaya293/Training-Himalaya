package com.himalaya;

import java.sql.Connection;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Exit {
	
	public static void sexit(){
     
	Configuration cf=new Configuration();
	cf.configure("configuration.xml");
	SessionFactory sf=cf.buildSessionFactory();
    Session se=sf.openSession();
    
    Transaction tx=se.beginTransaction();
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the option1");
	int option1=sc.nextInt();
	for(int i=option1;i<=option1;i++) {break;}
	}
}
