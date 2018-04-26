package com.kantravi.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	static SessionFactory oraclefactory=null;
	static SessionFactory mysqlfactory=null;
	static{
		Configuration cfg=new Configuration();
		cfg=cfg.configure("mysql.cfg.xml");
		StandardServiceRegistryBuilder ssrbuilder=new StandardServiceRegistryBuilder();
		StandardServiceRegistry ssRegistry=ssrbuilder.applySettings(cfg.getProperties()).build();
		mysqlfactory=cfg.buildSessionFactory(ssRegistry);	//It will create table 
		
		
		Configuration cfg1=new Configuration();
		cfg1=cfg1.configure("oracle.cfg.xml");
		StandardServiceRegistryBuilder ssrbuilder1=new StandardServiceRegistryBuilder();
		StandardServiceRegistry ssRegistry1=ssrbuilder1.applySettings(cfg1.getProperties()).build();
		oraclefactory=cfg1.buildSessionFactory(ssRegistry1);	//It will create table 
		
		
	}
	
	public static SessionFactory getSessionFactory(int x){
		if(x==1){
		return oraclefactory;
		}
		else {
			return mysqlfactory;
		}
	}
}
