package edu.global.ex.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface EmpMapper {
	@Select("select sysdate from dual")
	public String getTime();
}
