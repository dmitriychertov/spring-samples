package com.karmanov.shm.service;

import java.util.List;

import com.karmanov.shm.domain.Actor;

public interface ActorService {
	
	List<Actor> findActors();
	
	public List<Actor> findPaggedActors(Integer page);
	
}
