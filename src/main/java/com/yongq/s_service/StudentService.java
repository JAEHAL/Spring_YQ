package com.yongq.s_service;

import javax.servlet.http.HttpServletRequest;

import com.yongq.s_dto.StudentVO;

public interface StudentService {
	//public List<StudentVO> getInfo();
	public StudentVO LoginCheck(HttpServletRequest request);
	public StudentVO LoginInfo(HttpServletRequest request);
}
