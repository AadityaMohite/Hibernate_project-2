package com.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConfig {

	public static SessionFactory getseesionfactory() {
		
		Configuration  cfg = new Configuration();
		
		cfg.configure("Aadi.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		return sf;
		
	}
	
	
}
