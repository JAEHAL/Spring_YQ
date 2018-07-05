package com.yongq.a_dao;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.yongq.s_dto.ForuseVO;

@Repository
public class ViewUseDAOImpl implements ViewUseDAO {

	@Inject
	SqlSession sqlSession;
	
	private String namespace = "com.yongq.mapper.ViewUsage";
	
	//사용 내역 리스트 작업
	@Override
	public List<ForuseVO> ForuseList() {
		
		ForuseVO fVo = new ForuseVO();
		
		return sqlSession.selectList(namespace + ".ForuseList", fVo);
	}

	//충전 내역 리스트 작업
	@Override
	public List<ForuseVO> RechargeList() {
		
		ForuseVO fVo = new ForuseVO();
	
		return sqlSession.selectList(namespace + ".RechargeList", fVo);
	}

	//학번 검색 사용 리스트
	@Override
	public List<ForuseVO> ID_Search_Foruse(HttpServletRequest request) {
		
		String stu_id = request.getParameter("stu_id");
		
		ForuseVO fVo = new ForuseVO();
		
		fVo.setStu_id(stu_id);
		
		return sqlSession.selectList(namespace + ".ID_Search_Foruse", fVo);
	}

	//학번 검색 충전 리스트
	@Override
	public List<ForuseVO> ID_Search_Recharge(HttpServletRequest request) {

		String stu_id = request.getParameter("stu_id");
		
		ForuseVO fVo = new ForuseVO();
		
		fVo.setStu_id(stu_id);
		
		return sqlSession.selectList(namespace + ".ID_Search_Recharge", fVo);
	}

}
