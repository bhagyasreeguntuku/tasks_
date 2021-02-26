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

import com.src.model.Employee;

public class MainClass2 {
	public static void main(String[] args) {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
   
    SessionFactory factory = meta.getSessionFactoryBuilder().build();
    Session session = factory.openSession();
    Transaction t = session.beginTransaction();
    
//    Query q=session.createQuery("from Employee");
//    
//    q.setFirstResult(3);
//    q.setMaxResults(6);
//    List<Employee> li=((org.hibernate.query.Query) q).list();
//    for(Employee e:li)
//    {
//    	System.out.println(e);
//    }
//    Query q1=session.createQuery("update Employee set name=:en where empid=:i");
//    q1.setParameter("en","mehabbob");
//    q1.setParameter("i",300);
//    int status =q1.executeUpdate();
    
    
    
//    Query q2=session.createQuery("delete from Employee where empid=:i");
//    q2.setParameter("i",100);
//     int status1=q2.executeUpdate();
    
     Query q3 = session.createQuery("SELECT avg(eage) from Employee");
     List l = q3.list();
     System.out.println(l.get(0));
    
    
    
    
    t.commit();
    System.out.println("updated successfully");
    session.close();
    factory.close();

	}

}