package com.yongq.s_service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Repository;

import com.yongq.s_dao.MenuDAO;
import com.yongq.s_dto.MenuVO;

@Repository
public class MenuServiceImpl implements MenuService {

	@Inject
	MenuDAO mDao;
	
	//인성관
	@Override
	public List<MenuVO> Insung_Menu() {
		
		return mDao.Insung_Menu();
	}

	//환과대
	@Override
	public List<MenuVO> Hwan_Menu() {
		
		return mDao.Hwan_Menu();
	}

	//생활관
	@Override
	public List<MenuVO> Dorm_Menu() {
		
		return mDao.Dorm_Menu();
	}

	//주간 메뉴
	@Override
	public List<MenuVO> Week_Menu() {
		
		return mDao.Week_Menu();
	}

}
