package com.yongq.s_dao;

import java.util.List;

import javax.inject.Inject;

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
		return sqlSession.selectList(namespace + ".getInfo");
	}

	@Override
	public List<StudentVO> LoginCheck() {
		
		StudentVO sVo = new StudentVO();
		sVo.setStu_id("201233008");
		
		return sqlSession.selectList(namespace + ".LoginCheck", sVo);
	}
}
