package com.yongq.s_dao;

import javax.servlet.http.HttpServletRequest;

import com.yongq.s_dto.StudentVO;

public interface StudentDAO {
	//public List<StudentVO> getInfo(); //예제
	public StudentVO LoginCheck(HttpServletRequest request); //학생 로그인 체크
	public StudentVO LoginInfo(HttpServletRequest request); //학생 로그인 정보
}
