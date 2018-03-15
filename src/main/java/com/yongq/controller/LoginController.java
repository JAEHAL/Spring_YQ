package com.yongq.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yongq.s_dao.StudentDAO;
import com.yongq.s_dto.StudentVO;

@Controller
public class LoginController {

	@Inject
	StudentDAO sDao;
	
	@RequestMapping(value="/student")
	String student(StudentVO sVo, Model model) {
		List<StudentVO> list = sDao.get();
		
		model.addAttribute("lists", list);
		
		return "student";
	}
}
