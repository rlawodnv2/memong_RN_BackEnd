package com.memong.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.memong.dto.testDTO;
import com.memong.mapper.TestMapper;

@Service
public class TestService {
	
	@Autowired
	TestMapper testMapper;
	
	public void insertTest(testDTO test) {
		// TODO Auto-generated method stub
		testMapper.insertTest(test);
	}

}
