package com.practice;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.practice.Entity.Student;
import com.practice.Utility.HibernateUtility;

/**
 * Hello world!
 *
 */
public class AddSingleData {
	public static void main(String[] args) {
		Student s = new Student();
		s.setId(6);
		s.setfName("bbbb");
		s.setlName("bbb");
		s.setGender("bbbb");
		s.setCity("bbbb");
		s.setMobileNumber(9875643);

		// 1.session Factory
		SessionFactory factory = HibernateUtility.getSessionFactory();
		// 2.session from session factory
		Session session = factory.openSession();
		// 3. Transaction from session
		Transaction transaction = session.beginTransaction();
		// 4. to save single object
		session.persist(s);
		transaction.commit();
		// 6. session closed
		session.close();
	}
}
