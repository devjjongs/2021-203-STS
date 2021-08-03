package com.bit.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bit.spring.model.jdbc.dao.MemberDAO;
import com.bit.spring.model.jdbc.vo.Member;

@Controller
public class LoginPrcessController {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginPrcessController.class);
	
	MemberDAO dao = new MemberDAO();
//	dao.connection();
	
	
	@RequestMapping("loginForm")
	public String loginForm() {
		
		return "loginForm";
	}
	@RequestMapping( method = RequestMethod.POST )
	public String loginCheck(String userId , String userPw , Model model) {
		//userName , userPw  ==> 디비에 유무 판단 
//		System.out.println(userName + " " +userPw );
//		logger.info(userName + " " +userPw);
		
		MemberDAO dao = new MemberDAO();
		dao.connection();
		
		Member member =  dao.loginCheck(userId, userPw);
		if(member==null) {
			return "loginForm";
		}else {
			model.addAttribute("member", member);
			return "home";//home.jsp call
		}
	}
	@RequestMapping("memberListJdbc")
	public String memberListJdbc(Model model) {
		model.addAttribute("msg","memberListJdbc" );
		
		dao.memberList();
		
		return "memberList";
	}
	
	@RequestMapping("memberListTemplate")
	public String memberListTemplate(Model model) {
		model.addAttribute("msg","memberListTemplate" );
		return "memberList";
	}
	
	
	
}




