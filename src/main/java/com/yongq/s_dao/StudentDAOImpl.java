package com.yongq.s_dao;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.yongq.s_dto.StudentVO;

@Repository
public class StudentDAOImpl implements StudentDAO {
	
	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace =
			"com.yongq.mapper.MyMapper";
	
	@Override
	public List<StudentVO> getInfo() {
		return sqlSession.selectList(namespace + ".get");
	}

	@Override
	public List<StudentVO> LoginCheck(HttpServletRequest request, HttpSession session) {
		return sqlSession.selectList(namespace + ".LoginCheck");
	}
}
