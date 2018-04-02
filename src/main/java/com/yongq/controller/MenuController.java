package com.yongq.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MenuController {

	private static final Logger logger = LoggerFactory.getLogger(MenuController.class);
	
	//화면 잘 나오나 테스트
	@RequestMapping(value="/student_menu")
	String studeut_menu() {
		
		return "Student/Student_Menu";
	}
	
	//학생 메인화면에서 메뉴 버튼 클릭시 메뉴 화면으로 이동
	@RequestMapping(value="/Menu.do")
	String Menu_Page() {
		
		return "Student/Student_Menu";
	}
}
