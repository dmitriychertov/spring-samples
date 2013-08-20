package com.karmanov.shm.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.karmanov.shm.dao.ActorDao;
import com.karmanov.shm.domain.Actor;

@Repository
public class ActorDaoImpl extends AbstractDaoImpl<Actor, String> implements
		ActorDao {

	private static final String SELECT_ALL_FROM_ACTORS = "from Actor actor";

	public ActorDaoImpl(Class<Actor> entityClass) {
		super(entityClass);
	}

	public ActorDaoImpl() {

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Actor> findActors() {
		return getCurrentSession().createQuery(SELECT_ALL_FROM_ACTORS).list();
	}

	@SuppressWarnings("unchecked")
	public List<Actor> findPaggedActors(Integer page, Integer maxResults) {
		return getCurrentSession().createQuery(SELECT_ALL_FROM_ACTORS)
				.setFirstResult(maxResults * (page - 1))
				.setMaxResults(maxResults).list();
	}

}
