package com.yongq.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yongq.a_service.MenuInsertService;
import com.yongq.s_dto.MenuVO;

@Controller
public class A_MenuController {

	@Inject
	MenuInsertService mService;
	
	//private static final Logger logger = LoggerFactory.getLogger(A_MenuController.class);
	
	//메뉴 등록 페이지 이동
	@RequestMapping(value="Menu_Insert_Page.do")
	String menu_insert_page() {
		
		return "Admin/Admin_Menu_Insert";
	}
	
	//메뉴 등록  작업
	@RequestMapping(value="Menu_Insert.do")
	String menu_insert(HttpServletRequest request) {
		
		List<MenuVO> menu_insert = mService.MenuInsert(request);
		
		return "Admin/Admin_Main";
	}
	
	//메뉴 보기 페이지 이동
	@RequestMapping(value="AdminMenuWeek.do")
	String menu_see() {
		
		return "Student/Menu_Week";
	}

}