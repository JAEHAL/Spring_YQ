package com.yongq.controller;

import javax.inject.Inject;

import org.junit.Test;

import com.yongq.s_dao.StudentDAO;

public class StudentDAOImplTest extends AbstractTest {

	@Inject
	private StudentDAO dao;
	
	@Test
	public void get() {
		logger.info(""+dao.get());
	}
}
