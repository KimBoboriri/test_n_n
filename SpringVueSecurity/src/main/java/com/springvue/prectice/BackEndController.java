package com.springvue.prectice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.springvue.prectice.biz.MemberBiz;
import com.springvue.prectice.dto.MemberDto;

@Controller
public class BackEndController {
	
	Logger logger = LoggerFactory.getLogger(BackEndController.class);
	@Autowired
	private MemberBiz memberbiz;
	
	@PostMapping("/sendmsg")
	public ResponseEntity<Boolean>Test01(String mymsg) {
		String result = mymsg;
		System.out.println(mymsg);
		
		boolean gubun = false;
		if(mymsg != null) {
			gubun = true;
		}
		return ResponseEntity.ok(gubun);
	}
	
	@PostMapping("/loginRes")
	public ResponseEntity<?>LoginRes(MemberDto dto){
		logger.info("LoginRes");
		System.out.println(dto.getId() + "," + dto.getPw());
		MemberDto dtoRes = memberbiz.loginRes(dto);
		System.out.println(dtoRes.getId()+":결과");
		if(dtoRes == null) {
			return ResponseEntity.ok("failed");
		}else {
			System.out.println("성공");
			return ResponseEntity.ok(dtoRes);
		}
		
	}
	
	@PostMapping("/signupRes")
	public ResponseEntity<Boolean>SignupRes(MemberDto dto){
		logger.info("SignupRes");
		int res  = memberbiz.signupRes(dto);
		boolean gubun = false;
		
		if(res > 0) {
			gubun = true;
		}
		return ResponseEntity.ok(gubun);
	}
}
