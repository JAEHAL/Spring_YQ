package com.yongq.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yongq.s_dto.StudentVO;
import com.yongq.service.StudentService;

@Controller
public class LoginController {

	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Inject
	StudentService sDao;
	
	//db값 테스트
	@RequestMapping(value="/student")
	String student(StudentVO sVo, Model model) {
		List<StudentVO> list = sDao.getInfo();
		
		model.addAttribute("lists", list);
		
		return "student";
	}
	
	//학생 로그인 화면
	@RequestMapping(value="/login")
	String stu_login(){
		
		return "Student/Student_Login";
	}
	
	//로그인 작동
	@RequestMapping(value="/Login.do")
	String LoginDo(Model model, HttpServletRequest request) {
		
		//String stu_id = request.getParameter("stu_id");
		String stu_pw = request.getParameter("stu_pw");
		
		List<StudentVO> ckech_login = sDao.LoginCheck(request);
		
		if(!stu_pw.equals("") && stu_pw.equals(ckech_login.toString())) {
		
			List<StudentVO> login_info = sDao.LoginInfo(request);
			
			model.addAttribute("login_info", login_info);
			
			logger.info("로그인 성공");
			
			return "Student/Student_Main";
		} else {
			logger.info("로그인 실패");
			
			return "Student/Student_Login";
		}
		
		/*List<StudentVO> check_get_info = sDao.LoginCheck(request);
		
		model.addAttribute("test", check_get_info);
		
		logger.info("로그인 성공");
		logger.info("아이디 : " + request.getParameter("stu_id"));
		logger.info("비번 : " + check_get_info);
		*/
	}
	
	@RequestMapping(value="/admin")
	String admin_login() {
		
		return "Admin/Admin_Login";
	}
}
