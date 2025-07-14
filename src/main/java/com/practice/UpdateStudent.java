package com.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.practice.Entity.Student;
import com.practice.Utility.HibernateUtility;

public class UpdateStudent {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtility.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		Student s = session.find(Student.class, 3);
		s.setfName("Kajal");
		s.setlName("Jagtap");
		s.setCity("Pune");
		s.setGender("Female");
		
		transaction.commit();
		session.close();
	}

}
