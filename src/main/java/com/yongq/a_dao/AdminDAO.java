package com.yongq.a_dao;

import javax.servlet.http.HttpServletRequest;

import com.yongq.a_dto.AdminVO;

public interface AdminDAO {
	public AdminVO AdminCheck(HttpServletRequest request); // 관리자 로그인 체크
	public AdminVO AdminInfo(HttpServletRequest request); // 관리자 로그인 정보
}
