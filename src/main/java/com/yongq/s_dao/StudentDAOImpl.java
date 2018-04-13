package com.yongq.s_dao;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.yongq.s_dto.StudentVO;

@Repository
public class StudentDAOImpl implements StudentDAO {
	
	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace =
			"com.yongq.mapper.student_login";
	
	/*@Override
	public List<StudentVO> getInfo() {
		return sqlSession.selectList(namespace + ".getInfo");
	}*/

	@Override
	public StudentVO LoginCheck(HttpServletRequest request) {
		
		StudentVO sVo = new StudentVO();
		//sVo.setStu_id("201233008");
		sVo.setStu_id(request.getParameter("stu_id"));
		
		return sqlSession.selectOne(namespace + ".LoginCheck", sVo);
	}
	
	@Override
	public StudentVO LoginInfo(HttpServletRequest request) {
		
		StudentVO sVo = new StudentVO();
		sVo.setStu_id(request.getParameter("stu_id"));
		
		return sqlSession.selectOne(namespace + ".LoginInfo", sVo);
	}
}
