package com.yongq.s_dao;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.yongq.s_dto.ForuseVO;

public interface ForuseDAO {
	List<ForuseVO> setForuse1(HttpSession session); // 사용했을 때 foruse 테이블 추가 작업
	List<ForuseVO> setForuse2(HttpSession session); // 사용했을 때 student 잔액 변경 작업
	List<ForuseVO> OneWeek_Foruse(HttpSession session); // 사용내역 1주일
	List<ForuseVO> OneMonth_Foruse(HttpSession session); // 사용내역 1개월
	List<ForuseVO> ThreeMonth_Foruse(HttpSession session); // 사용내역 3개월
}
