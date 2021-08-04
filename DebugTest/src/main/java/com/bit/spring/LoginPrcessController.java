package com.bit.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bit.spring.model.jdbc.dao.MemberDAO;
import com.bit.spring.model.jdbc.vo.Member;
import com.bit.spring.model.orm.dao.MemberDaoMyBatis;
import com.bit.spring.model.template.dao.MemberDao;

@Controller
public class LoginPrcessController {

	private static final Logger logger = LoggerFactory.getLogger(LoginPrcessController.class);

	MemberDAO dao = new MemberDAO(); // jdbc 의 dao
//	dao.connection();

	@Autowired
	MemberDao memberDao; // spring template 의 dao 자동으로 연결
	
	@Autowired
	MemberDaoMyBatis memberDaoMyBatis;//MemberDaoMyBatis를 자동으로 연결

	@RequestMapping("loginForm")
	public String loginForm() {

		return "loginForm";
	}

	/**
	 * 호출하는 이름이 쓰여져 있지 않다. 그래서 loginCheck로 호출한다
	 * @param userId
	 * @param userPw
	 * @param model
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST)
	public String loginCheck(String userId, String userPw, Model model) {
		// userName , userPw ==> 디비에 유무 판단
//		System.out.println(userName + " " +userPw );
//		logger.info(userName + " " +userPw);

		MemberDAO dao = new MemberDAO();
		dao.connection();

		Member member = dao.loginCheck(userId, userPw);
		if (member == null) {
			return "loginForm";
		} else {
			model.addAttribute("member", member);
			return "home";// home.jsp call
		}
	}
	
	
	
	// ORM //
	/**
	 * 
	 * Orm MyBatis에 의해서 처리된 결과를 이용
	 * @param userId
	 * @param userPw
	 * @param model
	 * @return
	 */
	
	@RequestMapping(method=RequestMethod.POST, value = "getMember")
	public String getMember(String userId, String userPw, Model model) {
		
		com.bit.spring.model.orm.vo.Member member = memberDaoMyBatis.getMember(userId, userPw);
		
		if (member == null) {
			return "loginForm";
		} else {
			model.addAttribute("member", member);
			return "home";// home.jsp call
		}
	}
	
	
	
	
	
	

	@RequestMapping("memberListJdbc")
	public String memberListJdbc(Model model) {
		model.addAttribute("msg", "memberListJdbc");
		model.addAttribute("memberList", dao.memberList());// key="memberList", value=List<Member>
		return "memberList";// memberList.jsp
	}

	@RequestMapping("memberListTemplate")
	public String memberListTemplate(Model model) {
		model.addAttribute("msg", "memberListTemplate");
		model.addAttribute("memberList", memberDao.memberList());
		return "memberList";
	}

	@RequestMapping("memberListOrm")
	public String memberListOrm(Model model) {
		model.addAttribute("msg", "memberListOrm");
		model.addAttribute("memberList", memberDaoMyBatis.getAllMember());
		return "memberList";
	}
}
