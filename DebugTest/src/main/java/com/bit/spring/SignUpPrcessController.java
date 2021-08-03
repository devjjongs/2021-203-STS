package com.bit.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bit.spring.dao.MemberDAO;
import com.bit.spring.vo.Member;

@Controller
public class SignUpPrcessController {
	private static final Logger logger = LoggerFactory.getLogger(SignUpPrcessController.class);
	
	@RequestMapping("signupForm")
	public String siString() {
		return "signupForm";
	}
	
//	@RequestMapping(method = RequestMethod.GET)
//	public String signUp(String userId, String userPw, String userName, String email, Integer age, Model model) {
//		
//		MemberDAO dao = new MemberDAO();
//		dao.connection();
//		
//		Member member = dao.signUp(userId, userPw, userName, email, age);
//		if(member.getUserId()==null) {
//			
//		}else {
//			return "home";
//		}
//	}
	
}

