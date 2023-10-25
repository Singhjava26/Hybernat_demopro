package com.hibernate.MCU;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.hibernate.MCU.model.Marvel;
import com.hibernate.MCU.util.HerosUtil;
public class Marvel_Library_dao
{
	public void saveMarvel(Marvel lib)
	{
		Transaction transaction=null;
		try(Session session=HerosUtil.getSessionFactory().openSession())
		{
			transaction = session.beginTransaction();
			session.save(lib);
			transaction.commit();
		}
		catch(Exception e)
		{
			if(transaction!=null)
			{
				transaction.rollback();
			}
		}
	}
	public void updateMarvel(Marvel lib)
	{
		Transaction transaction=null;
		try(Session session=HerosUtil.getSessionFactory().openSession())
		{
			transaction = session.beginTransaction();
			session.saveOrUpdate(lib);
			transaction.commit();
		}
		catch(Exception e)
		{
			if(transaction!=null)
			{
				transaction.rollback();
			}
		}
	}
	public void deleteMarvel(long id)
	{
		Transaction transaction=null;
		try(Session session=HerosUtil.getSessionFactory().openSession())
		{
			transaction = session.beginTransaction();
			Marvel lib =session.get(Marvel.class, id);
			session.delete(lib);
			transaction.commit();
		}
		catch(Exception e)
		{
			if(transaction!=null)
			{
				transaction.rollback();
			}
		}
	}
	public void getMarvelById(long id)
	{
		Transaction transaction=null;
		try(Session session=HerosUtil.getSessionFactory().openSession())
		{
			transaction = session.beginTransaction();
			Marvel lib =session.get(Marvel.class, id);
			System.out.println(lib);
			transaction.commit();
		}
		catch(Exception e)
		{
			if(transaction!=null)
			{
				transaction.rollback();
			}
		}
	}
}
