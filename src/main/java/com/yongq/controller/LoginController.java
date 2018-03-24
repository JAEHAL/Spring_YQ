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
	String LoginDo(HttpServletRequest request) {
		
		//String stu_id = request.getParameter("stu_id");
		//String stu_pw = request.getParameter("stu_pw");
		
		List<StudentVO> result = sDao.LoginCheck(request);
		
		if(result.equals("loginInfo")) {
			
			return "Student/Student_Main";
		} else {
			return "Student/Student_Login";
		}
	}
		/*String result = sDao.LoginCheck(request, sVo, session);
		
		if(result.equals("sc")){
			logger.info("로그인 성공");
			
			String stu_name = (String)session.getAttribute("stu_name");
			logger.info(stu_name);
			model.addAttribute("stu_name", stu_name);
			
			return "Student/Student_Main";
		} else if(result.equals("!sc2")) {
			logger.info("존재하지 않는 아이디 or 비번 틀림");
		} else {
			logger.info("아이디 비번 빈칸");
		}
		
		return result;*/
	
	
	@RequestMapping(value="/admin")
	String admin_login() {
		
		return "Admin/Admin_Login";
	}
}
