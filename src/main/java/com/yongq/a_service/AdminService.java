package com.yongq.a_service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.yongq.a_dto.AdminVO;

public interface AdminService {
	public List<AdminVO> Admin();
	public List<AdminVO> AdminCheck(HttpServletRequest request);
	public List<AdminVO> AdminInfo(HttpServletRequest request);
}
