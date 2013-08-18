package com.karmanov.shm.dao.impl;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.karmanov.shm.dao.AbstractDao;

public class AbstractDaoImpl<E, I extends Serializable> implements
		AbstractDao<E, I> {

	@Autowired
	SessionFactory sessionFactory;
	
	private Session session;

	private Class<E> entityClass;

	public AbstractDaoImpl(Class<E> entityClass) {
		this.entityClass = entityClass;
	}

	public AbstractDaoImpl() {
		super();
	}

	public Session getCurrentSession() {
		if (session == null) {
			session = sessionFactory.openSession();
		} else {
			sessionFactory.getCurrentSession();
		}
		return session;
	}

}
