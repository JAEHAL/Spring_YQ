package com.yongq.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yongq.s_dto.RechargeVO;
import com.yongq.s_service.RechargeService;

@Controller
public class RechargeController {

	@Inject
	RechargeService rechargeService;
	
	//학생 충전 페이지 이동
	@RequestMapping(value="/Recharge.Page")
	String recharge_page() {
		
		return "Student/Student_Recharge";
	}
	
	//학생 충전 작업
	@RequestMapping(value="/Recharge.do")
	String recharge(HttpServletRequest request, HttpSession session) {
		
		List<RechargeVO> setRecharge1 = rechargeService.setRecharge1(request, session);
		List<RechargeVO> setRecharge2 = rechargeService.setRecharge2(request, session);
		
		return "Student/Student_Main";
	}
}
