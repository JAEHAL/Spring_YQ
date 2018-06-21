package com.yongq.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yongq.a_dto.AdminVO;
import com.yongq.a_service.AdminService;

@Controller
public class A_LoginController {

	private static final Logger logger = LoggerFactory.getLogger(A_LoginController.class);
	
	@Inject
	AdminService aDao;
	
	//관리자 로그인 화면
	@RequestMapping(value="/Ad_Login_Page.do")
	String admin_login_page() {
		
		return "Admin/Admin_Login";
	}
	
	//관리자에서 학생 로그인 화면
	@RequestMapping(value="/Stu_Login_Page.do")
	String student_login_page() {
		
		return "Student/Student_Login";
	}
	
	//관리자 로그인 작동
	@RequestMapping(value="/Admin.do")
	String AdminDo (Model model, HttpServletRequest request) {
		
		//String ad_id = request.getParameter("ad_id");
		String ad_pw = request.getParameter("ad_pw");
		
		AdminVO aVo = aDao.AdminCheck(request);
		
		if(!ad_pw.equals("") && ad_pw.equals(aVo.getAd_pw())) {
		
			AdminVO login_info = aDao.AdminInfo(request);
			
			model.addAttribute("login_info", login_info);
			
			logger.info("로그인 성공");
			
			return "Admin/Admin_Main";
		} else {
			logger.info("로그인 실패");
			
			return "Admin/Admin_Login";
		}
	}
	
	//로그아웃
	@RequestMapping(value="Logout2.do")
	String Logout2() {
		
		return "Admin/Admin_Login";
	}
	
	//관리자 뒤로 가기 버튼
	@RequestMapping(value="back_main2.do")
	String back_main2() {
		
		return "Admin/Admin_Main";
	}
}
