package com.yongq.s_dao;

import java.util.List;

import com.yongq.s_dto.MenuVO;

public interface MenuDAO {
	public List<MenuVO> Insung_Menu(); //인성관 메뉴
	public List<MenuVO> Hwan_Menu(); //환과대 메뉴
	public List<MenuVO> Dorm_Menu(); //생활관 메뉴
	public List<MenuVO> Week_Menu(); //주간메뉴
}
