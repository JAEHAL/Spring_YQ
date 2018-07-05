package com.yongq.a_dao;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.yongq.s_dto.ForuseVO;

public interface ViewUseDAO {
	List<ForuseVO> ForuseList(); // 학생 사용 내역 리스트
	List<ForuseVO> RechargeList(); // 학생 충전 내역 리스트
	List<ForuseVO> ID_Search_Foruse(HttpServletRequest request); // 학번 검색 사용 리스트
	List<ForuseVO> ID_Search_Recharge(HttpServletRequest request); // 학번 검색 충전 리스트
}
