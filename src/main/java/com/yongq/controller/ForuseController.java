package com.yongq.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yongq.s_dto.ForuseVO;
import com.yongq.s_service.ForuseService;

@Controller
public class ForuseController {

	@Inject
	ForuseService foruseService;
	
	@RequestMapping(value="/Usage.do")
	public String use(HttpSession session) {
		
		List<ForuseVO> setForuse1 = foruseService.setForuse1(session);
		List<ForuseVO> setForuse2 = foruseService.setForuse2(session);
		
		return "Student/Student_Main";
	}
}
