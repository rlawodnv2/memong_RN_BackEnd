package com.memong.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.memong.dto.testDTO;

@Mapper
@Repository
public interface TestMapper {

	void insertTest(testDTO test);

}
