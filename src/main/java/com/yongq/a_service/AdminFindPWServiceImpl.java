package com.yongq.a_service;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Repository;

import com.yongq.a_dao.AdminFindPWDAO;
import com.yongq.s_dto.StudentVO;

@Repository
public class AdminFindPWServiceImpl implements AdminFindPWService {

	@Inject
	AdminFindPWDAO aDao;
	
	@Override
	public StudentVO FindPW(HttpServletRequest request) {

		return aDao.FindPW(request);
	}

}
