package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class Main {

	public static void main(String[] args) {
		
		
		// Write the Student_Info object into the database
		StudentInfo student = new StudentInfo();
		student.setName("Arnav");
		student.setRollNo(1);

		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		// this would save the Student_Info object into the database
		session.save(student);
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}
}
