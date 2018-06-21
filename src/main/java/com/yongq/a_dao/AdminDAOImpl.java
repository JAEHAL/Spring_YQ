package com.yongq.a_dao;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.yongq.a_dto.AdminVO;

@Repository
public class AdminDAOImpl implements AdminDAO {

	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace =
			"com.yongq.mapper.admin_login";

	@Override
	public AdminVO AdminCheck(HttpServletRequest request) {
		
		AdminVO aVo = new AdminVO();
		aVo.setAd_id(request.getParameter("ad_id"));
		
		return sqlSession.selectOne(namespace + ".AdminCheck", aVo);
	}

	@Override
	public AdminVO AdminInfo(HttpServletRequest request) {

		AdminVO aVo = new AdminVO();
		aVo.setAd_id(request.getParameter("ad_id"));
		
		return sqlSession.selectOne(namespace + ".AdminInfo", aVo);
	}
	
}

