package com.bit.spring.model.template.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.bit.spring.model.jdbc.dao.MemberDAO;
import com.bit.spring.model.template.vo.Member;

// p133
public class MemberDaoImpl extends JdbcDaoSupport implements MemberDao {

	@Override
	public List<Member> memberList() {
		// TODO Auto-generated method stub
		String sql = "select userId ,userPw , email, age, userName  from  member  ";
		MemberRowMapper rowMapper = new MemberRowMapper();
		List<Member> memberList = getJdbcTemplate().query(sql, rowMapper);
		return memberList;
	}

	@Override
	public Member loginCheck() {
		// TODO logincheck
		String sql = "select email, age, userName  from  member  where  userId =? and userPw = ? ";
		MemberRowMapper rowMapper = new MemberRowMapper();
		
		return null;
	}

	@Override
	public Member memberInsert() {
		// TODO member insert
		
		return null;
	}

	@Override
	public Member delete() {
		// TODO delete
		return null;
	}
}
