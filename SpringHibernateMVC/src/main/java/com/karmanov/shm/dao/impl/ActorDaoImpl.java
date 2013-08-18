package com.karmanov.shm.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.karmanov.shm.dao.ActorDao;
import com.karmanov.shm.domain.Actor;

@Repository
public class ActorDaoImpl extends AbstractDaoImpl<Actor, String> implements
		ActorDao {

	public ActorDaoImpl(Class<Actor> entityClass) {
		super(entityClass);
	}

	public ActorDaoImpl() {

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Actor> findActors() {
		// Session session = getCurrentSession();
		// Query query = session.createSQLQuery("select * from actor");
		return getCurrentSession().createQuery("from Actor actor").list();
		// List<Actor> result = query.list();
		// return result;
		// return
		// getCurrentSession().createSQLQuery("select * from actor").list();
	}

}
