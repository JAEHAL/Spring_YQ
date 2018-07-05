package com.yongq.a_dao;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.yongq.s_dto.StudentVO;

@Repository
public class AdminFindPWDAOImpl implements AdminFindPWDAO {

	@Inject
	SqlSession sqlSession;
	
	private String namespace = "com.yongq.mapper.find_password";
	
	@Override
	public StudentVO FindPW(HttpServletRequest request) {

		String stu_id = request.getParameter("stu_id");
		
		StudentVO sVo = new StudentVO();
		
		sVo.setStu_id(stu_id);
		
		return sqlSession.selectOne(namespace + ".find_password", sVo);
	}

}
