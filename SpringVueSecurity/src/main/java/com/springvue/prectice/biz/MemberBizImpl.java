package com.springvue.prectice.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springvue.prectice.dto.MemberDto;
import com.springvue.prectice.mapper.MemberMapper;

@Service
public class MemberBizImpl implements MemberBiz{

	@Autowired
	private MemberMapper membermapper;
	
	@Override
	public MemberDto loginRes(MemberDto dto) {
		// TODO Auto-generated method stub
		return membermapper.loginRes(dto);
	}

	@Override
	public int signupRes(MemberDto dto) {
		// TODO Auto-generated method stub
		return membermapper.signupRes(dto);
	}

}
