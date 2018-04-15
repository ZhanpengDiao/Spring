package com.diao.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.diao.hibernate.demo.entity.Student;

public class QueryStudentDemo {

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

			
			// start a transaction
			session.beginTransaction();
			
			// query students
//			List<Student> theStudents = session.createQuery("from Student").getResultList();
//			theStudents.forEach((e) -> System.out.println(e));
			
			// query students: lastName='Doe'
//			List<Student> theStudents = session.createQuery("from Student s where s.lastName = 'Doe'").getResultList();
//			theStudents.forEach((e) -> System.out.println(e));
			
			// query students: lastName='Doe' or firstName = 'Paul'
//			List<Student> theStudents = session.createQuery("from Student s where s.lastName = 'Doe' or s.firstName = 'Paul'").getResultList();
//			theStudents.forEach((e) -> System.out.println(e));
//			
			// query students: email like "john%"
			List<Student> theStudents = session.createQuery("from Student s where s.email like 'john%'").getResultList();
			theStudents.forEach((e) -> System.out.println(e));
			
			// commit transaction
			session.getTransaction().commit();
			System.out.println("Done!");
			
		} finally {
			factory.close();
		}
		
	}

}
