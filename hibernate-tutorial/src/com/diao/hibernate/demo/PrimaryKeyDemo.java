package com.diao.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.diao.hibernate.demo.entity.Student;

public class PrimaryKeyDemo {

	public static void main(String[] args) {
		// create session factory
				SessionFactory factory = new Configuration()
										 .configure("hibernate.cfg.xml")
										 .addAnnotatedClass(Student.class)
										 .buildSessionFactory();
				
				// create session
				Session session = factory.getCurrentSession();
				
				try {
					// use the session
					// create 3 student objs
					System.out.println("Creating 3 new student obj...");
					Student tempStudent1 = new Student("John", "Doe", "john@hbstudent.com");
					Student tempStudent2 = new Student("Mary", "Public", "mary@hbstudent.com");
					Student tempStudent3 = new Student("John", "Don", "johndon@hbstudent.com");
					
					// start a transaction
					session.beginTransaction();
					
					// save the obj
					session.save(tempStudent1);
					session.save(tempStudent2);
					session.save(tempStudent3);
					
					// commit transaction
					session.getTransaction().commit();
					System.out.println("Done!");
					
				} finally {
					factory.close();
				}

	}

}
