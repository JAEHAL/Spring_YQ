package com.yongq.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yongq.s_dto.StudentVO;
import com.yongq.s_service.StudentService;

@Controller
public class S_LoginController {

	private static final Logger logger = LoggerFactory.getLogger(S_LoginController.class);
	
	@Inject
	StudentService sDao;
	
	//db값 테스트
	/*@RequestMapping(value="/student")
	String student(StudentVO sVo, Model model) {
		List<StudentVO> list = sDao.getInfo();
		
		model.addAttribute("lists", list);
		
		return "student";
	}*/
	
	//메인페이지로 돌아가기 버튼 작동
	@RequestMapping(value="/back_main")
	String back_main_page() {
		
		return "Student/Student_Main";
	}
	
	//학생 로그인 화면
	@RequestMapping(value="/login")
	String student_login(){
		
		return "Student/Student_Login";
	}
	
	//로그인 작동
	//다른페이지에서 메인페이지로 뒤로가기 눌렀을 때 처리 하기 위한 session 찾아보기
	@RequestMapping(value="/Login.do")
	public String LoginDo(Model model, HttpServletRequest request, HttpSession session) {
		
		String stu_id = request.getParameter("stu_id");
		String stu_pw = request.getParameter("stu_pw");
		
		StudentVO check_login = sDao.LoginCheck(request);
		
		if(!stu_pw.equals("") && stu_pw.equals(check_login.getStu_pw())) {
		
			StudentVO sVo = sDao.LoginInfo(request);
			
			logger.info("로그인 성공");
			//logger.info(login_info.getStu_name());
			
			int stu_change = sVo.getStu_change();
			String stu_name = sVo.getStu_name();
			//logger.info("잔액 : " + stu_change);
			
			session.setAttribute("login_id", stu_id); // 충전 시 학생 정보 변경을 위한 세션
			session.setAttribute("login_change", stu_change); // 충전 할 때 db정보 바뀌기위한 세션
			session.setAttribute("login_name", stu_name); // 메인페이지 학생 이름 보여주기 위한 세션
	
			session.setAttribute("login_info", sVo);
			
			return "Student/Student_Main";
		} else {
			logger.info("로그인 실패");
			
			return "Student/Student_Login";
		}
		
	}
	
	//메인페이지에서 학생정보로 넘어가는 작동
	@RequestMapping(value="/Student_Info.do")
	String student_info_page() {
		
		return "Student/Student_Info";
	}
	
	//로그아웃 작동
	//나중에 session하면 session제거 작업 해주기
	@RequestMapping(value="/Logout.do")
	String Logout() {
		
		return "Student/Student_Login";
	}

}
