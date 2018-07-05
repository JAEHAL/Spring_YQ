package com.yongq.a_dao;

import javax.servlet.http.HttpServletRequest;

import com.yongq.s_dto.StudentVO;

public interface AdminFindPWDAO {
	StudentVO FindPW(HttpServletRequest request); // 관리자가 학생 비밀번호 찾기 작업
}
