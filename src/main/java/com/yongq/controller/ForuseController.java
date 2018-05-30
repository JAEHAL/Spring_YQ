package com.yongq.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yongq.s_dto.ForuseVO;
import com.yongq.s_service.ForuseService;

@Controller
public class ForuseController {

	@Inject
	ForuseService foruseService;
	
	//학생 정보 페이지에서 사용내역 버튼 누를 시 작업
	@RequestMapping(value="/Usage.do")
	public String use(HttpSession session) {
		
		List<ForuseVO> setForuse1 = foruseService.setForuse1(session);
		List<ForuseVO> setForuse2 = foruseService.setForuse2(session);
		
		return "Student/Student_Main";
	}
	
	//사용 내역 보여주는 페이지 이동
	@RequestMapping(value="/ViewUse.Page")
	public String viewUse() {
		
		return "Student/Student_ViewUse";
	}
	
	//1주일 사용 내역
	@RequestMapping(value="/OneWeek_foruse.do")
	public String oneweek(Model model, HttpSession session) {

		List<ForuseVO> oneweek = foruseService.OneWeek_Foruse(session);
		
		model.addAttribute("oneweek", oneweek);
		
		return "Student/OneWeek_Foruse";
	}
	
	//1개월 사용 내역
	@RequestMapping(value="/OneMonth_foruse.do")
	public String onemonth(Model model, HttpSession session) {

		List<ForuseVO> onemonth = foruseService.OneMonth_Foruse(session);
		
		model.addAttribute("onemonth", onemonth);
		
		return "Student/OneMonth_Foruse";
	}
	
	//3개월 사용 내역
	@RequestMapping(value="/ThreeMonth_foruse.do")
	public String threemonth(Model model, HttpSession session) {

		List<ForuseVO> threemonth = foruseService.ThreeMonth_Foruse(session);
		
		model.addAttribute("threemonth", threemonth);
		
		return "Student/ThreeMonth_Foruse";
	}
}
