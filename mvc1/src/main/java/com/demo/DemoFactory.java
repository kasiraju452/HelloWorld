package com.demo;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class DemoFactory {

	public static void main(String[] args) {
		StandardServiceRegistry serviceRegistry = 
				new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml")
				.build();
		
		SessionFactory factory = 
				new MetadataSources(serviceRegistry).buildMetadata().buildSessionFactory();

	}

}
