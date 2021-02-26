package com.src.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.src.model.Customer;
import com.src.model.Product;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
          Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
     
      SessionFactory factory = meta.getSessionFactoryBuilder().build();
      Session session = factory.openSession();
      Transaction t = session.beginTransaction();
      Customer c=new Customer();
      
      c.setName("shiva");
     Product p=new Product();
      
     p.setProductName("Fan");
     p.setProductPrice(200);
       
       
       c.setP(p);
       
       
     Customer c1=new Customer();
     c1.setName("bhagya");
     Product p1=new Product();
     c1.setP(p);
        
        
      
        session.persist(c);
          session.persist(c1);
         
         
       
       
       
       
       
       
       
       t.commit();
            System.out.println("values inserted successfully");
      session.close();
      factory.close();


	}

}