package com.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.practice.Entity.Student;
import com.practice.Utility.HibernateUtility;

public class DeleteSingleData {
	
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtility.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Student s = session.find(Student.class, 4);
		session.remove(s);
		
		transaction.commit();
		session.close();
	}

}
