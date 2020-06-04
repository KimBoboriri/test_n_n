package com.springvue.prectice.biz;

import org.springframework.stereotype.Service;

import com.springvue.prectice.dto.MemberDto;

@Service
public interface MemberBiz {

	public MemberDto loginRes(MemberDto dto);
	public int signupRes(MemberDto dto);
}
