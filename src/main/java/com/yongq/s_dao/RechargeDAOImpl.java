package com.yongq.s_dao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.yongq.s_dto.ForuseVO;
import com.yongq.s_dto.RechargeVO;
import com.yongq.s_dto.StudentVO;

@Repository
public class RechargeDAOImpl implements RechargeDAO {

	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace =
			"com.yongq.mapper.Student_Recharge";
	
	//오늘 날짜
	public String today() {
		
		SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		
		String today = simpleDate.format(date);
		
		return today;
	}
	
	//충전 했을때 foruse 테이블에 추가
	@Override
	public List<RechargeVO> setRecharge1(HttpServletRequest request, HttpSession session) {
		
		String recharge_mn = request.getParameter("recharge_mn");
		int recharge_mn2 = Integer.parseInt(recharge_mn);
		
		String stu_id = (String)session.getAttribute("login_id");
		
		ForuseVO fVo = new ForuseVO();
		fVo.setStu_id(stu_id);
		fVo.setDate(today());
		fVo.setMn_price(recharge_mn2);
		
		return sqlSession.selectList(namespace + ".recharge_sql", fVo);
	}

	//충전 했을때 student 잔액 바꾸기
	@Override
	public List<RechargeVO> setRecharge2(HttpServletRequest request, HttpSession session) {
		
		StudentVO sVo = new StudentVO();
		
		String stu_id = (String)session.getAttribute("login_id");
		int stu_change = (int)session.getAttribute("login_change");
		
		String recharge_mn = request.getParameter("recharge_mn");
		int recharge_mn2 = Integer.parseInt(recharge_mn);
		
		int update_stu_change = stu_change + recharge_mn2;
		
		sVo.setStu_change(update_stu_change);
		sVo.setStu_id(stu_id);
		
		return sqlSession.selectList(namespace + ".recharge_sql2", sVo);
	}
}
