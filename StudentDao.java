package com.hiber.demo.Hibernate_first_project;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.hiber.demo.Hibernate_first_project.model.Student;
import com.hiber.demo.Hibernate_first_project.util.HibernateUtil;

public class StudentDao 
{
	public void saveStudent(Student student)
	{
		Transaction transaction=null;
		try(Session session=HibernateUtil.getSessionFactory().openSession())
		{
			transaction=session.beginTransaction();
			session.save(student);
			transaction.commit();
		}
		catch (Exception e) 
		{
			if(transaction!=null)
			{
				transaction.rollback();
			}
		}
		
	}
	public void updateStudent(Student student)
	{
		Transaction transaction=null;
		try(Session session=HibernateUtil.getSessionFactory().openSession())
		{
			transaction=session.beginTransaction();
			session.saveOrUpdate(student);
			transaction.commit();
		}
		catch (Exception e) 
		{
			if(transaction!=null)
			{
				transaction.rollback();
			}
		}
		
	}
	
	public void deleteStudent(long id)
	{
		Transaction transaction=null;
		try(Session session=HibernateUtil.getSessionFactory().openSession())
		{
			transaction=session.beginTransaction();
			Student student=session.get(Student.class, id);
			session.delete(student);
			transaction.commit();
		}
		catch (Exception e) 
		{
			if(transaction!=null)
			{
				transaction.rollback();
			}
		}
		
	}
	
	public void getStudentById(long id)
	{
		Transaction transaction=null;
		try(Session session=HibernateUtil.getSessionFactory().openSession())
		{
			transaction=session.beginTransaction();
			Student student=session.get(Student.class, id);
			System.out.println(student);
			transaction.commit();
		}
		catch (Exception e) 
		{
			if(transaction!=null)
			{
				transaction.rollback();
			}
		}
		
	}
	

}