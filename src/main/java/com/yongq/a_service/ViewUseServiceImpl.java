package com.yongq.a_service;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Repository;

import com.yongq.a_dao.ViewUseDAO;
import com.yongq.s_dto.ForuseVO;

@Repository
public class ViewUseServiceImpl implements ViewUseService {

	@Inject
	ViewUseDAO vDo;
	
	//사용 내역 리스트 작업
	@Override
	public List<ForuseVO> ForuseList() {
		
		return vDo.ForuseList();
	}

	//충전 내역 리스트 작업
	@Override
	public List<ForuseVO> RechargeList() {
		
		return vDo.RechargeList();
	}

	//학번 검색 사용 리스트
	@Override
	public List<ForuseVO> ID_Search_Foruse(HttpServletRequest request) {
		
		return vDo.ID_Search_Foruse(request);
	}

	//학번 검색 충전 리스트
	@Override
	public List<ForuseVO> ID_Search_Recharge(HttpServletRequest request) {
		
		return vDo.ID_Search_Recharge(request);
	}

}
