package com.bit.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginPrcessController {

	private static final Logger logger = LoggerFactory.getLogger(LoginPrcessController.class); // static 한 logger는 this가
																								// 생성되기 전에 실행되기 때문에
																								// this를 인식 X

	@RequestMapping("loginForm") // Class를 호출하여 사용하고자 할때 사용 // 생략시 Default
	public String loginForm() {

		return "loginForm"; // @RequestMapping이 제대로 호출되면 return 호출
	}

	@RequestMapping(method = RequestMethod.POST) // post 형식으로 호출하여 사용
	public String loginCheck(String userName, String userPw) {
		// userName, userPw ==> DB에 있는 값인지 유무를 판단
//		System.out.println(userName + " " + userPw);
//		logger.info(userName + " " + userPw);
		return "home"; // home.jsp call
	}
}