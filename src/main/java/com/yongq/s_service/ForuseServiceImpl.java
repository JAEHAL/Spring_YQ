package com.yongq.s_service;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Repository;

import com.yongq.s_dao.ForuseDAO;
import com.yongq.s_dto.ForuseVO;

@Repository
public class ForuseServiceImpl implements ForuseService {

	@Inject
	ForuseDAO fDao;
	
	@Override
	public List<ForuseVO> setForuse1(HttpSession session) {
		
		return fDao.setForuse1(session);
	}

	@Override
	public List<ForuseVO> setForuse2(HttpSession session) {
		
		return fDao.setForuse2(session);
	}

}
