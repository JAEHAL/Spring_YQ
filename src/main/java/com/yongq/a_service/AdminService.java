package com.yongq.a_service;

import javax.servlet.http.HttpServletRequest;

import com.yongq.a_dto.AdminVO;

public interface AdminService {
	public AdminVO AdminCheck(HttpServletRequest request);
	public AdminVO AdminInfo(HttpServletRequest request);
}
