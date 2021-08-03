package com.bit.spring.model.template.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.bit.spring.model.template.vo.Member;

// p133
public class MemberDaoImpl  extends JdbcDaoSupport implements MemberDao {
	
	@Override
	public List<Member> memberList() {
		// TODO Auto-generated method stub
		String sql ="select userId ,userPw , email, age, userName  from  member  ";
		MemberRowMapper rowMapper  = new MemberRowMapper();
		List<Member> memberList = getJdbcTemplate().query(sql, rowMapper);
		
		
		return memberList;
	}

}








