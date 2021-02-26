package com.motivity;

import java.util.HashSet;
import java.util.Set;
import javax.imageio.spi.ServiceRegistry;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Logic {

	public static void main(String[] args) {
		
		
		Configuration cf=new Configuration();
		cf.configure("hibernate.cfg.xml");
		SessionFactory sf=cf.buildSessionFactory();
        Session se=sf.openSession();
        
        Transaction tx=se.beginTransaction();
        
        Dep d=new Dep();
        d.setDid(102);
        d.setDname("software");
        d.setDcode("12345");
       
        
        Hima h=new Hima();
        h.setSid(103);
        h.setSname("hima");
        h.setMarks("720");
        h.setAddress("hyd");
        h.setSchool_name("mps");
        
        Set<Hima> set=new HashSet<Hima>();
        set.add(h);
        d.setHima(set);
        
        se.save(d);
        tx.commit();
        se.close();
        
        
	}


}
