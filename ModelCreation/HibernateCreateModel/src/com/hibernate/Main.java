package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class Main {

	public static void main(String[] args) {

		Main ob1 = new Main();
		//ob1.upload();
		ob1.display();

	}


	void upload() {
		// Write the Student_Info object into the database
		StudentInfo student = new StudentInfo();
		//student.setRollNo(1);		as then field ROLLNO is annotated as @GeneratedValue, i.e. auto generation is enabled.


		student.setName("Richa");


		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		// this will save the StudentInfo object to the database
		session.save(student);

		session.getTransaction().commit();
		session.close();
		//sessionFactory.close();	// explicit closing of the session factory
	}


	void display() {
		// Fetch the Student_Info object from the database
		StudentInfo student = new StudentInfo();
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		student = (StudentInfo) session.get(StudentInfo.class, 4);		// get method to fetch and dsiplay records from database		
		System.out.println("The name of the student is : " + student.getName());
		
		student.setName("PGaur");
		session.update(student);		// used to update a value of any column
		
		
		student = (StudentInfo) session.get(StudentInfo.class, 5);		// fetch the object to delete
		session.delete(student);										// delete it using the delete method
		
		session.getTransaction().commit();
		session.close();
		//sessionFactory.close();	// explicit closing of the session factory

	}
}
