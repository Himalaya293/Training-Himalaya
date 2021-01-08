package com.motivity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Departmentlogic {

	public Department depdetails(int eid,String deptcode,String deptname) {
		
		SessionFactory sf=new Configuration().configure("configuration.xml").buildSessionFactory();
        Session se=sf.openSession();
        
        Transaction tx=se.beginTransaction();
        Department dep=new Department();
        dep.setEid(eid);
        dep.setDeptcode(deptcode);
        dep.setDeptname(deptname);

        se.save(dep);
        tx.commit();
        System.out.println("details added");
		return dep;
    }
}