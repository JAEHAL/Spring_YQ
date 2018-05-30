package com.yongq.s_dao;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.yongq.s_dto.ForuseVO;
import com.yongq.s_dto.RechargeVO;

public interface RechargeDAO {
	List<RechargeVO> setRecharge1(HttpServletRequest request, HttpSession session); //충전했을 때 foruse테이블에 추가
	List<RechargeVO> setRecharge2(HttpServletRequest request, HttpSession session); //충전했을 때 student 금액 바꾸기
	List<ForuseVO> OneWeek_Recharge(HttpSession session); // 충전내역 1주일
	List<ForuseVO> OneMonth_Recharge(HttpSession session); // 충전내역 1개월
	List<ForuseVO> ThreeMonth_Recharge(HttpSession session); // 충전내역 3개월
}
