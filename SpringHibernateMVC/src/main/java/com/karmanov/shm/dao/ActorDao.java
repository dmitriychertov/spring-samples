package com.karmanov.shm.dao;

import java.util.List;

import com.karmanov.shm.domain.Actor;

public interface ActorDao extends AbstractDao<Actor, String> {
	
	public List<Actor> findActors();
	
	public List<Actor> findPaggedActors(Integer page, Integer maxResults);
	

}
