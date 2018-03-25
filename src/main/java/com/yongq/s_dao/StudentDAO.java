package com.yongq.s_dao;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.yongq.s_dto.StudentVO;

public interface StudentDAO {
	public List<StudentVO> getInfo(); //예제
	public List<StudentVO> LoginCheck(); //학생 로그인 체크
}
