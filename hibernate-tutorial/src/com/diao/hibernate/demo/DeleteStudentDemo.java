package com.diao.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.diao.hibernate.demo.entity.Student;

public class DeleteStudentDemo {

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
			int stdId = 1;
			
			// start a transaction
			session.beginTransaction();
			
			// retrieve student based on the id
//			System.out.println("Getting student with id" + stdId);
//			
//			Student myStudent = session.get(Student.class, stdId);
//			
//			session.delete(myStudent);
//			
//			session.getTransaction().commit();
//			
//			// delete student with id = 2
//			session = factory.getCurrentSession();
//			session.beginTransaction();
			
			System.out.println("Update email for all students");
			session.createQuery("delete from Student where id = 2").executeUpdate();
			
			// commit the transaction
			session.getTransaction().commit();
			
		} finally {
			factory.close();
		}
		
	}

}
