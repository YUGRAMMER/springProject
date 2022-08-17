package com.mono.myapp.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.mono.myapp.dao.TestDao;
import com.mono.myapp.vo.UserVO;

@Service
public class TestServiceImpl implements TestService {

	@Inject
	private TestDao dao;
	
	@Override
	public List<UserVO> selectUser() throws Exception {
		// TODO Auto-generated method stub
		return dao.selectUser();
	}

}
