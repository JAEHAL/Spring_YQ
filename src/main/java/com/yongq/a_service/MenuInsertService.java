package com.yongq.a_service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.yongq.s_dto.MenuVO;

public interface MenuInsertService {
	List<MenuVO> MenuInsert(HttpServletRequest request);
}
