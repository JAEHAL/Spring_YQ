package com.yongq.s_dao;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yongq.s_dto.StudentVO;

@Repository
public class StudentDAOImpl implements StudentDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	private static final String namespace =
			"com.yongq.mapper.MyMapper";
	
	@Override
	public List<StudentVO> getInfo() {
		return sqlSession.selectList(namespace + ".getInfo");
	}

	@Override
	public List<StudentVO> LoginCheck(String stu_id) {
		
		return sqlSession.selectList(namespace + ".LoginCheck");
	}
}
