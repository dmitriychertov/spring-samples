package com.karmanov.spring.jdbc.demo.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class CircleDaoImpl extends JdbcDaoSupport {
	
	public int getCircleCount() {
		String sqlString = "SELECT COUNT(*) FROM CIRCLE";
		return getJdbcTemplate().queryForObject(sqlString, Integer.class);
	}

}
