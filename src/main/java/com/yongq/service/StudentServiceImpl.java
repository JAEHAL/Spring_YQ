package com.yongq.service;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

import com.yongq.s_dao.StudentDAO;
import com.yongq.s_dto.StudentVO;

@Repository
public class StudentServiceImpl implements StudentService {

	@Inject
	StudentDAO sDao;
	
	@Override
	public List<StudentVO> getInfo() {
		
		List<StudentVO> list = sDao.getInfo();
		
		return list;
	}
	
	@Override
	public List<StudentVO> LoginCheck() {
	
		return sDao.LoginCheck();
		/*List<StudentVO> loginInfo = sDao.LoginCheck(request.getParameter("stu_id"));
		
		//입력한 아이디 비밀번호 출력
		System.out.println("비번" + loginInfo.get(0).toString());
		
		if(!request.getParameter("stu_pw").equals("") && request.getParameter("stu_pw").equals(loginInfo.toString())) {
			
			return loginInfo;
		} else {
			
			return null;
		}*/
	}
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
		
		/*List<StudentVO> list = studentDao.LoginCheck(request, session);
		
		return list;*/

}
