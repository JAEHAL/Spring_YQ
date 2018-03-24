package com.yongq.s_dao;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.yongq.s_dto.StudentVO;

public interface StudentDAO {
	public List<StudentVO> getInfo();
	public List<StudentVO> LoginCheck(String stu_id);
}
