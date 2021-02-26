package com.src.main;

import java.util.ArrayList;
import java.util.List;

//import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.src.model.Product;
import com.src.model.User;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
   
    SessionFactory factory = meta.getSessionFactoryBuilder().build();
    Session session = factory.openSession();
    Transaction t = session.beginTransaction();
    User u=new User();
    //u.setUid(1);
    u.setUsername("sai");
    List<Product> p=new ArrayList();
    Product p2=new Product();
   // p2.setPid(1);
    p2.setPname("toothpaste");
    p2.setPrice(100.0);
    Product p1=new Product();
   // p1.setPid(2);
    p1.setPname("Chairs");
    p1.setPrice(900.0);
    p.add(p1);
    p.add(p2);
    u.setProducts(p);
    session.persist(u);
    User u1=new User();
   u1.setUsername("kiran");
    List<Product> l=new ArrayList();
    Product p3=new Product();
   p3.setPname("book");
  p3.setPrice(40.0);
    Product p4=new Product();
   p4.setPname("clock");
    p4.setPrice(340.0);
 l.add(p3);
    l.add(p4);
  u1.setProducts(l);
    
session.persist(u1);
    t.commit();
    System.out.println("values inserted successfully");
    session.close();
    factory.close();

	}

}
