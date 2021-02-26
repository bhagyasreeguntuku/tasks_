package com.src.main;

import java.util.List;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import com.src.model.Customer;
import com.src.model.Product;
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
          Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
     
      SessionFactory factory = meta.getSessionFactoryBuilder().build();
      Session session = factory.openSession();
      Transaction t = session.beginTransaction();
    
 Query q=session.createQuery("from Customer");
 List<Customer> li=q.list();
 for(Customer c:li)
 {
	 System.out.println(c);
 }
       
       
       
       
       
       t.commit();
            System.out.println("values inserted successfully");
      session.close();
      factory.close();


	}

}