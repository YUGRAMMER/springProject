package com.mono.myapp.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.mono.myapp.vo.UserVO;

@Repository
public class TestDaoImpl implements TestDao {
	private static final String namespace="com.mono.myapp.mapper.testMapper";
	
	@Inject
	private SqlSession sqlSession;
	
	@Override
	public List<UserVO> selectUser() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(namespace+".test");
	}

}
