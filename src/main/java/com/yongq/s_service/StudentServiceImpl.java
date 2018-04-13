package com.yongq.s_service;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Repository;

import com.yongq.s_dao.StudentDAO;
import com.yongq.s_dto.StudentVO;

@Repository
public class StudentServiceImpl implements StudentService {

	@Inject
	StudentDAO sDao;
	
	/*@Override
	public List<StudentVO> getInfo() {
		
		List<StudentVO> list = sDao.getInfo();
		
		return list;
	}*/
	
	@Override
	public StudentVO LoginCheck(HttpServletRequest request) {
	
		//List<StudentVO> login_check = sDao.LoginCheck(request);
		
		return sDao.LoginCheck(request);
		
	}
	
	@Override
	public StudentVO LoginInfo(HttpServletRequest request) {
		
		return sDao.LoginInfo(request);
	}

}
