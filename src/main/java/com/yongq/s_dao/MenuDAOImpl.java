package com.yongq.s_dao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.yongq.s_dto.MenuVO;

@Repository
public class MenuDAOImpl implements MenuDAO{

	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = 
			"com.yongq.mapper.Menu";
	
	//오늘 날짜
	public String today() {
		
		SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		
		String today = simpleDate.format(date);
		
		return today;
	}
	
	//인성관
	@Override
	public List<MenuVO> Insung_Menu() {
		
		MenuVO mVo = new MenuVO();
		mVo.setChain("인성관");
		mVo.setDate(today());
		
		return sqlSession.selectList(namespace + ".Insung_Menu", mVo);
	}

	//환과대
	@Override
	public List<MenuVO> Hwan_Menu() {
		
		MenuVO mVo = new MenuVO();
		mVo.setChain("환과대");
		mVo.setDate(today());
		
		return sqlSession.selectList(namespace + ".Hwan_Menu", mVo);
	}

	//생활관
	@Override
	public List<MenuVO> Dorm_Menu() {
		
		MenuVO mVo = new MenuVO();
		mVo.setChain("생활관");
		mVo.setDate(today());
		
		return sqlSession.selectList(namespace + ".Dorm_Menu", mVo);
	}

	//주간 메뉴
	@Override
	public List<MenuVO> Week_Menu() {
		
		return sqlSession.selectList(namespace + ".Week_Menu");
	}

}
