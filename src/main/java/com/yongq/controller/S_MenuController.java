package com.yongq.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yongq.s_dto.MenuVO;
import com.yongq.s_service.MenuService;

@Controller
public class S_MenuController {

	@Inject
	MenuService menuService;
	
	//private static final Logger logger = LoggerFactory.getLogger(MenuController.class);
	
	/*//화면 잘 나오나 테스트
	@RequestMapping(value="/student_menu")
	String studeut_menu() {
		
		return "Student/Student_Menu";
	}
	*/
	
	//학생 메인화면에서 메뉴 버튼 클릭시 메뉴 화면으로 이동
	@RequestMapping(value="/Menu.do")
	String Menu_Page(Model model) {
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		
		String today = format.format(date);
		
		model.addAttribute("date", today);
		
		return "Student/Student_Menu";
	}
	
	//인성관
	@RequestMapping(value="/Insung.do")
	String Insung_Menu(Model model) {
		
		List<MenuVO> insung_menu = menuService.Insung_Menu();
		
		model.addAttribute("insung_menu", insung_menu);
		
		return "Student/Menu_Insung";
	}
	
	//환과대
	@RequestMapping(value="/Hwan.do")
	String Hwan_Menu(Model model) {
		
		List<MenuVO> hwan_menu = menuService.Hwan_Menu();
		
		model.addAttribute("hwan_menu", hwan_menu);
		
		return "Student/Menu_Hwan";
	}
	
	//생활관
	@RequestMapping(value="/Dorm.do")
	String Dorm_Menu(Model model) {
		
		List<MenuVO> dorm_menu = menuService.Dorm_Menu();
		
		model.addAttribute("dorm_menu", dorm_menu);
		
		return "Student/Menu_Dorm";
	}
	
	//주간메뉴
	@RequestMapping(value="/MenuWeek.do")
	String Week_Menu(Model model) {
		
		List<MenuVO> week_menu = menuService.Week_Menu();
		
		model.addAttribute("week_menu", week_menu);
		
		return "Student/Menu_Week";
	}
}
