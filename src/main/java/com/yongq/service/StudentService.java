package com.yongq.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.yongq.s_dto.StudentVO;

public interface StudentService {
	public List<StudentVO> getInfo();
	public List<StudentVO> LoginCheck(HttpServletRequest request);
}
