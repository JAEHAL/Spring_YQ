package com.yongq.a_dao;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.yongq.s_dto.MenuVO;

@Repository
public class MenuInsertDAOImpl implements MenuInsertDAO {

	@Inject
	SqlSession sqlSession;
	
	private String namespace="com.yongq.mapper.Menu";
	
	//관리자 메뉴 등록
	@Override
	public List<MenuVO> MenuInsert(HttpServletRequest request) {
		
		String mn_id = request.getParameter("mn_id");
		String chain = request.getParameter("chain");
		String date = request.getParameter("date");
		String mn_name = request.getParameter("mn_name");
		String mn_price = request.getParameter("mn_price");
		String mn_type = request.getParameter("mn_type");
		String mn_sold = request.getParameter("mn_sold");
		
		int mn_price2 = Integer.parseInt(mn_price);
		
		MenuVO mVo = new MenuVO();
		
		mVo.setMn_id(mn_id);
		mVo.setChain(chain);
		mVo.setDate(date);
		mVo.setMn_name(mn_name);
		mVo.setMn_price(mn_price2);
		mVo.setMn_type(mn_type);
		mVo.setMn_sold(mn_sold);
		
		return sqlSession.selectList(namespace + ".MenuInsert", mVo);
	}

}