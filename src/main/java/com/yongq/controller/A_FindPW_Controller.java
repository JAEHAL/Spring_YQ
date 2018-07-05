package com.yongq.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yongq.a_service.AdminFindPWService;
import com.yongq.s_dto.StudentVO;

@Controller
public class A_FindPW_Controller {

	@Inject
	AdminFindPWService aService;
	
	//비밀번호 찾기 페이지 이동
	@RequestMapping(value="FindMenuPage.do")
	String find_menu_page() {
		
		return "Admin/Find_Password";
	}
	
	//비밀번호 찾기 작업
	@RequestMapping(value="FindPW.do")
	String findPW(HttpServletRequest request, Model model) {
		
		StudentVO find_pw = aService.FindPW(request);
		
		String found_pw = find_pw.getStu_pw();
		String found_name = find_pw.getStu_name();
		
		model.addAttribute("found_pw", found_pw);
		model.addAttribute("found_name", found_name);
		
		return "Admin/Find_Password";
	}
}
