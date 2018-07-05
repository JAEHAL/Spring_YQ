package com.yongq.a_service;

import javax.servlet.http.HttpServletRequest;

import com.yongq.s_dto.StudentVO;

public interface AdminFindPWService {
	StudentVO FindPW(HttpServletRequest request);
}
