package com.yongq.s_dao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.yongq.s_dto.ForuseVO;
import com.yongq.s_dto.MenuVO;
import com.yongq.s_dto.StudentVO;

@Repository
public class ForuseDAOImpl implements ForuseDAO {
	
	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = 
			"com.yongq.mapper.Student_Foruse";
	
	//오늘 날짜
	public String today() {
		
		SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		
		String today = simpleDate.format(date);
		
		return today;
	}
	
	// 사용했을 때 foruse db 테이블에 추가
	@Override
	public List<ForuseVO> setForuse1(HttpSession session) {
		
		//MenuVO mVo = new MenuVO();
		
		String stu_id = (String)session.getAttribute("login_id");
		
		ForuseVO fVo = new ForuseVO();
		
		fVo.setStu_id(stu_id);
		fVo.setDate(today());
		
		/*
		fVo.setChain(mVo.getChain());
		fVo.setMn_name(mVo.getMn_name());
		fVo.setMn_price(mVo.getMn_price());
		*/
		
		return sqlSession.selectList(namespace + ".foruse_sql", fVo);
		
	}

	@Override
	public List<ForuseVO> setForuse2(HttpSession session) {
		
		StudentVO sVo = new StudentVO();
		//MenuVO mVo = new MenuVO();
		
		String stu_id = (String)session.getAttribute("login_id");
		int stu_change = (int)session.getAttribute("new_change");
		
		//int stu_change = Integer.parseInt(get_stu_change);
		
		int update_stu_change = stu_change - 5000;
		
		sVo.setStu_change(update_stu_change);
		sVo.setStu_id(stu_id);
		
		session.setAttribute("new_change", sVo.getStu_change()); // 충전할 때의 학생 잔액 session이름과 똑같은데 오류 안남
		
		return sqlSession.selectList(namespace + ".foruse_sql2", sVo);
	}

}
