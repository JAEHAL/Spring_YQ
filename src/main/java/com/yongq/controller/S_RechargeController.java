package com.yongq.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yongq.s_dao.RechargeDAO;
import com.yongq.s_dto.ForuseVO;
import com.yongq.s_dto.RechargeVO;
import com.yongq.s_service.RechargeService;

@Controller
public class S_RechargeController {

	@Autowired
	private SqlSession sqlSession;
	
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
	
	//충전 내역 보여주는 페이지 이동
	@RequestMapping(value="/ViewRecharge.Page")
	public String viewRecharge() {
		
		return "Student/Student_ViewRecharge";
	}
	
	//1주일 충전 내역
	@RequestMapping(value="/OneWeek_recharge.do")
	public String oneweek(Model model, HttpSession session) {

		List<ForuseVO> oneweek = rechargeService.OneWeek_Recharge(session);
		
		model.addAttribute("oneweek", oneweek);
		
		return "Student/Recharge_OneWeek";
	}
	
	//1개월 충전 내역
	@RequestMapping(value="/OneMonth_recharge.do")
	public String onemonth(Model model, HttpSession session) {

		List<ForuseVO> onemonth = rechargeService.OneMonth_Recharge(session);
		
		model.addAttribute("onemonth", onemonth);
		
		return "Student/Recharge_OneMonth";
	}
	
	//3개월 충전 내역
	@RequestMapping(value="/ThreeMonth_recharge.do")
	public String threemonth(Model model, HttpSession session) {

		List<ForuseVO> threemonth = rechargeService.ThreeMonth_Recharge(session);
		
		model.addAttribute("threemonth", threemonth);
		
		return "Student/Recharge_ThreeMonth";
	}
}
