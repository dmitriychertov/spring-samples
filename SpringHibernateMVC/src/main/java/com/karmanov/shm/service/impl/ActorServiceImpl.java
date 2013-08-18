package com.karmanov.shm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.karmanov.shm.dao.ActorDao;
import com.karmanov.shm.domain.Actor;
import com.karmanov.shm.service.ActorService;

@Service("actorService")
@Transactional(readOnly = true)
public class ActorServiceImpl implements ActorService {

	@Autowired
	private ActorDao actorDao;
	
	public ActorServiceImpl() {
		super();
	}



	@Override
	public List<Actor> findActors() {
		return actorDao.findActors();
	}

}
