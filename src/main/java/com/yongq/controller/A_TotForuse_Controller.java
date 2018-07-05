package com.yongq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class A_TotForuse_Controller {

	//메인에서 정산 페이지로 이동
	@RequestMapping(value="TotForuse.do")
	String TotForuse_page() {
		
		return "Admin/TotForuse";
	}
	
	//정산 페이지에서 인성관 정산 페이지로 이동
	@RequestMapping(value="move_TotInsung")
	String Tot_Insung() {
		
		return "Admin/TotForuse_Insung";
	}
	
	//정산 페이지에서 환과대 정산 페이지로 이동
	@RequestMapping(value="move_TotHwan")
	String Tot_Hwan() {
		
		return "Admin/TotForuse_Hwan";
	}
	
	//정산 페이지에서 생활관 정산 페이지로 이동
	@RequestMapping(value="move_TotDorm")
	String Tot_Dorm() {
		
		return "Admin/TotForuse_Dorm";
	}
}