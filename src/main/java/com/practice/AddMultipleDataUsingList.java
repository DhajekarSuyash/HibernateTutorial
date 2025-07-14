package com.practice;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.practice.Entity.Student;
import com.practice.Utility.HibernateUtility;

public class AddMultipleDataUsingList {

	public static void main(String[] args) {

		Student s = new Student();
		s.setId(6);
		s.setfName("bbbb");
		s.setlName("bbb");
		s.setGender("bbbb");
		s.setCity("bbbb");
		s.setMobileNumber(9875643);

		Student s1 = new Student();
		s1.setId(3);
		s1.setfName("Abc");
		s1.setlName("aaa");
		s1.setGender("aaa");
		s1.setCity("aaa");
		s1.setMobileNumber(9875643);

		Student s2 = new Student();
		s2.setId(4);
		s2.setfName("zzz");
		s2.setlName("zzz");
		s2.setGender("zzz");
		s2.setCity("zzz");
		s2.setMobileNumber(55555);

		List<Student> studentList = Arrays.asList(s, s1, s2);

		// 1.session Factory
		SessionFactory factory = HibernateUtility.getSessionFactory();
		// 2.session from session factory
		Session session = factory.openSession();
		// 3. to save list of student
		for (Student stu : studentList) {
			// 4. Transaction from session
			Transaction transaction = session.beginTransaction();
			session.persist(stu);
			transaction.commit();
		}
		// 5. session closed
		session.close();
	}
}
