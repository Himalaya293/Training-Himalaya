package com.motivity;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Paysliplogic {

	public static List<Employee> pslip(int aid) {
		SessionFactory sf=new Configuration().configure("configuration.xml").buildSessionFactory();
        Session se=sf.openSession();
        Transaction tx=se.beginTransaction();
        
        Query qr=se.createQuery("from Employee e where e.eid=:aid");
        qr.setParameter("aid", aid);
        List<Employee> er=qr.list();
		tx.commit();
		if(!er.isEmpty()) {
			return er;
		}
		else
		return null;
	}
	public static List<Deduction> payroll(int aid) {
		SessionFactory sf=new Configuration().configure("configuration.xml").buildSessionFactory();
        Session se=sf.openSession();
        Transaction tx=se.beginTransaction();
        
        Query qr=se.createQuery("from Deduction d where d.eid=:aid");
        qr.setParameter("aid", aid);
        List<Deduction> er=qr.list();
		tx.commit();
		if(!er.isEmpty()) {
			return er;
		}
		else
		return null;
   }
}