package com.yongq.a_dao;

import java.util.List;

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
	public List<AdminVO> AdminCheck(HttpServletRequest request) {
		
		AdminVO aVo = new AdminVO();
		aVo.setAd_id(request.getParameter("ad_id"));
		
		return sqlSession.selectList(namespace + ".AdminCheck", aVo);
	}

	@Override
	public List<AdminVO> AdminInfo(HttpServletRequest request) {

		AdminVO aVo = new AdminVO();
		aVo.setAd_id(request.getParameter("ad_id"));
		aVo.setAd_pw(request.getParameter("ad_pw"));
		
		return sqlSession.selectList(namespace + ".AdminInfo", aVo);
	}

	@Override
	public List<AdminVO> Admin() {
		
		return sqlSession.selectList(namespace, ".Admin");
	}
	
	
}

