package com.yongq.s_service;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Repository;

import com.yongq.s_dao.RechargeDAO;
import com.yongq.s_dto.ForuseVO;
import com.yongq.s_dto.RechargeVO;

@Repository
public class RechargeServiceImpl implements RechargeService{

	@Inject
	RechargeDAO rDao;
	
	@Override
	public List<RechargeVO> setRecharge1(HttpServletRequest request, HttpSession session) {
		
		return rDao.setRecharge1(request, session);
	}

	
	@Override
	public List<RechargeVO> setRecharge2(HttpServletRequest request, HttpSession session) {
		
		return rDao.setRecharge2(request, session);
	}

	//충전 내역 1주일
	@Override
	public List<ForuseVO> OneWeek_Recharge(HttpSession session) {

		return rDao.OneWeek_Recharge(session);
	}

	//충전 내역 1개월
	@Override
	public List<ForuseVO> OneMonth_Recharge(HttpSession session) {
		
		return rDao.OneMonth_Recharge(session);
	}

	//충전 내역 3개월
	@Override
	public List<ForuseVO> ThreeMonth_Recharge(HttpSession session) {
		
		return rDao.ThreeMonth_Recharge(session);
	}

}
