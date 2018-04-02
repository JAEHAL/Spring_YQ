package com.yongq.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yongq.a_dto.AdminVO;
import com.yongq.a_service.AdminService;
import com.yongq.s_dto.StudentVO;
import com.yongq.service.StudentService;

@Controller
public class LoginController {

	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Inject
	StudentService sDao;
	AdminService aDao;
	
	//db값 테스트
	/*@RequestMapping(value="/student")
	String student(StudentVO sVo, Model model) {
		List<StudentVO> list = sDao.getInfo();
		
		model.addAttribute("lists", list);
		
		return "student";
	}*/
	
	//관리자 예제
	@RequestMapping(value="/admin_ex")
	String admin(Model model, HttpServletRequest request) {
		
		List<AdminVO> list = aDao.Admin();
		
		model.addAttribute("ex", list);
		
		return "admin";
	}
	
	//학생 로그인 화면
	@RequestMapping(value="/login")
	String student_login(){
		
		return "Student/Student_Login";
	}
	
	//로그인 작동
	@RequestMapping(value="/Login.do")
	String LoginDo(Model model, HttpServletRequest request) {
		
		//String stu_id = request.getParameter("stu_id");
		String stu_pw = request.getParameter("stu_pw");
		
		List<StudentVO> check_login = sDao.LoginCheck(request);
		
		String pwd = check_login.get(0).getStu_pw();
		//logger.info("비번 저장" + pwd);
		
		if(!stu_pw.equals("") && stu_pw.equals(pwd)) {
		
			List<StudentVO> login_info = sDao.LoginInfo(request);
			
			model.addAttribute("login_info", login_info);
			
			logger.info("로그인 성공");
			
			return "Student/Student_Main";
		} else {
			logger.info("로그인 실패");
			
			return "Student/Student_Login";
		}
		
	}
	
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
		
		String ad_pw = request.getParameter("ad_pw");
		
		List<AdminVO> check_login = aDao.AdminCheck(request);
		
		model.addAttribute("ex", check_login);
		
		String pwd = check_login.get(0).getAd_pw();
		//logger.info("비번 저장" + pwd);
		
		if(!ad_pw.equals("") && ad_pw.equals(pwd)) {
		
			List<AdminVO> login_info = aDao.AdminInfo(request);
			
			model.addAttribute("login_info", login_info);
			
			logger.info("로그인 성공");
			
			return "Admin/Admin_Main";
		} else {
			logger.info("로그인 실패");
			
			return "Admin/Admin_Login";
		}
	}
}
