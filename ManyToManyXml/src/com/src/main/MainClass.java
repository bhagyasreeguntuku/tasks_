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

import com.src.model.Answer;
import com.src.model.Question;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
          Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
     
      SessionFactory factory = meta.getSessionFactoryBuilder().build();
      Session session = factory.openSession();
      Transaction t = session.beginTransaction();
      
       Question q=new Question();
       q.setQueValue("What is hibernate");
       
       Answer a1=new Answer();
       a1.setAnsDesc("its a framework");
       a1.setPostedBy("shiva");
       
       Answer a2=new Answer();
       a2.setAnsDesc("its a orm tool");
       a2.setPostedBy("bhagya");
       
       List<Answer> al=new ArrayList();
       al.add(a1);
       al.add(a2);
       
       q.setAnswers(al);
       
       
       

       Question q1=new Question();
       q1.setQueValue("What is spring");
       
       Answer a4=new Answer();
       a4.setAnsDesc("its a framework of framework");
       a4.setPostedBy("shiva");
       
       Answer a3=new Answer();
       a3.setAnsDesc("tool");
       a3.setPostedBy("bhagya");
       
       List<Answer> al1=new ArrayList();
       al1.add(a3);
       al1.add(a4);
       
       q1.setAnswers(al1);
       
       
       
       
       
       session.persist(q);
       session.persist(q1);
       
       
       
       
       
       
       t.commit();
            System.out.println("values inserted successfully");
      session.close();
      factory.close();


	}

}