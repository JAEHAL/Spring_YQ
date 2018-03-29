package com.yongq.a_service;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Repository;

import com.yongq.a_dao.AdminDAO;
import com.yongq.a_dto.AdminVO;

@Repository
public class AdminServiceImpl implements AdminService {
	
	@Inject
	AdminDAO aDao;

	@Override
	public List<AdminVO> AdminCheck(HttpServletRequest request) {
		
		return aDao.AdminCheck(request);
	}

	@Override
	public List<AdminVO> AdminInfo(HttpServletRequest request) {
		
		return aDao.AdminInfo(request);
	}

	
}
