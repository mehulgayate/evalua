package com.evalua.entity.support;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class DataStoreManager {

	private SessionFactory sessionFactory;	

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void save(EntityBase entity){		
		getSession().persist(entity);
	}

	private Session getSession(){
		return sessionFactory.getCurrentSession();
	}

}
