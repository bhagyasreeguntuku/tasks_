package com.src.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


import com.src.model.Employee;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
          Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
     
      SessionFactory factory = meta.getSessionFactoryBuilder().build();
      Session session = factory.openSession();
      Transaction t = session.beginTransaction();
      
      Employee e1=new Employee();
      e1.setEmpid(100);
      e1.setName("shiva");
      e1.setEage(17);
      
      Employee e2=new Employee();
      e2.setEmpid(200);
      e2.setName("bhagya");
      e2.setEage(18);
      
      Employee e3=new Employee();
      e3.setEmpid(300);
      e3.setName("satya");
      e3.setEage(19);
      
      Employee e4=new Employee();
      e4.setEmpid(400);
      e4.setName("sai");
      e4.setEage(20);
      
      Employee e5=new Employee();
      e5.setEmpid(500);
      e5.setName("usha");
      e5.setEage(21);
      
      Employee e6=new Employee();
      e6.setEmpid(600);
      e6.setName("monal");
      e6.setEage(22);
      
      Employee e7=new Employee();
      e7.setEmpid(700);
      e7.setName("sohel");
      e7.setEage(23);
      
      
     
    	 session.save(e1);
    	 session.save(e2);
    	 session.save(e3);
    	 session.save(e4);
    	 session.save(e5);
    	 session.save(e6);
    	 session.save(e7);
    	 
    	
     
       
       
       
       

       
       
       
       
       
       
       
       t.commit();
            System.out.println("values inserted successfully");
      session.close();
      factory.close();


	}

}