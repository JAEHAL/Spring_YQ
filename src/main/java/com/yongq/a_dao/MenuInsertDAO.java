package com.yongq.a_dao;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.yongq.s_dto.MenuVO;

public interface MenuInsertDAO {
	public List<MenuVO> MenuInsert(HttpServletRequest request); //관리자 메뉴 등록
}
