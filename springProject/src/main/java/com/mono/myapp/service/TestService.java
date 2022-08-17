package com.mono.myapp.service;

import java.util.List;

import com.mono.myapp.vo.UserVO;

public interface TestService {
	public List<UserVO> selectUser() throws Exception;
}
