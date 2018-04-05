package com.yongq.s_service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.yongq.s_dto.StudentVO;

public interface StudentService {
	//public List<StudentVO> getInfo();
	public StudentVO LoginCheck(HttpServletRequest request);
	public List<StudentVO> LoginInfo(HttpServletRequest request);
}
