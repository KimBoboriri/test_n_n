package com.springvue.prectice.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.springvue.prectice.dto.MemberDto;

@Mapper
public interface MemberMapper {

	@Select(" SELECT * FROM MEMBER WHERE id=#{id} AND pw=#{pw} ")
	public MemberDto loginRes(MemberDto dto);
	
	@Insert(" INSERT INTO MEMBER VALUES(#{id},#{name},#{pw}) ")
	public int signupRes(MemberDto dto);
}
