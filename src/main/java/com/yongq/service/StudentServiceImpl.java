package com.yongq.service;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Repository;

import com.yongq.s_dao.StudentDAO;
import com.yongq.s_dto.StudentVO;

@Repository
public class StudentServiceImpl implements StudentService {

	@Inject
	StudentDAO studentDao;
	
	@Override
	public List<StudentVO> getInfo() {
		
		List<StudentVO> list = studentDao.getInfo();
		
		return list;
	}
	
	@Override
	public List<StudentVO> LoginCheck(HttpServletRequest request, HttpSession session) {
	
		/*//로그인 성공
		if(stu_pw.equals(sVo.getStu_pw()) && stu_id.equals(sVo.getStu_id())) {
			
			session.setAttribute("stu_name", sVo.getStu_name());
			result = "sc";
		}
		//아이디, 비번 입력 빈칸 일때
		else if(stu_id.equals("") && stu_pw.equals("")) {
			
			result  = "!sc";
		}
		//존재하지 않는 아이디거나 비번이 틀렸을 때
		else if(!stu_pw.equals(sVo.getStu_pw()) && !stu_id.equals(sVo.getStu_id())) {
				
			result  = "!sc2";
		}
			return result;
		}*/
		
		List<StudentVO> list = studentDao.LoginCheck(request, session);
		
		return list;
	}
}
