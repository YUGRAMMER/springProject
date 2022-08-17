package com.mono.myapp.dao;

import java.util.List;

import com.mono.myapp.vo.UserVO;

public interface TestDao {
	public List<UserVO> selectUser() throws Exception;
}
