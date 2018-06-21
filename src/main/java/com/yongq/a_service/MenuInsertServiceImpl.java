package com.yongq.a_service;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Repository;

import com.yongq.a_dao.MenuInsertDAO;
import com.yongq.s_dto.MenuVO;

@Repository
public class MenuInsertServiceImpl implements MenuInsertService {

	@Inject
	MenuInsertDAO mDao;
	
	@Override
	public List<MenuVO> MenuInsert(HttpServletRequest request) {
		
		return mDao.MenuInsert(request);
	}

}
