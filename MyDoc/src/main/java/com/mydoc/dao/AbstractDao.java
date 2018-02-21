package com.mydoc.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public abstract class AbstractDao {
	
	protected SessionFactory factory = new Configuration().configure().buildSessionFactory();
	

}