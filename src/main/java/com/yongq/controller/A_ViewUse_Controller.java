package com.yongq.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yongq.a_service.ViewUseService;
import com.yongq.s_dto.ForuseVO;

@Controller
public class A_ViewUse_Controller {

	@Inject
	ViewUseService vService;
	
	//사용.충전 내역 페이지 이동
	@RequestMapping(value="ViewUsePage")
	String viewUse_page() {
		
		return "Admin/ViewUse";
	}
	
	//사용 내역 페이지 이동 & 작업
	@RequestMapping(value="move_Foruse")
	String foruseList(Model model) {
		
		List<ForuseVO> foruseList = vService.ForuseList();
		
		model.addAttribute("f_list", foruseList);
		
		return "Admin/ForuseList";
	}
	
	//충전 내역 페이지 이동 & 작업
	@RequestMapping(value="move_Recharge")
	String rechargeList(Model model) {
		
		List<ForuseVO> rechargeList = vService.RechargeList();
		
		model.addAttribute("r_list", rechargeList);
		
		return "Admin/RechargeList";
	}
	
	//사용 내역에서 학번 검색 시 사용 내역 리스트
	@RequestMapping(value="F_ID_Search")
	String f_id_search(HttpServletRequest request, Model model) {
		
		List<ForuseVO> search = vService.ID_Search_Foruse(request);
		
		model.addAttribute("f_list", search);
		
		return "Admin/ForuseList";
	}
	
	//충전 내역에서 학번 검색 시 충전 내역 리스트
	@RequestMapping(value="R_ID_Search")
	String r_id_search(HttpServletRequest request, Model model) {
		
		List<ForuseVO> search = vService.ID_Search_Recharge(request);
		
		model.addAttribute("r_list", search);
		
		return "Admin/RechargeList";
	}
}
