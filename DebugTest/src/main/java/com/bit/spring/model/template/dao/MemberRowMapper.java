package com.bit.spring.model.template.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bit.spring.model.template.vo.Member;

public class MemberRowMapper implements RowMapper<Member> {

	@Override
	public Member mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Member  member = new Member();
		member.setUserId(resultSet.getString(1));
		member.setUserPw(resultSet.getString(2));
		member.setEmail(  resultSet.getString("email") );
		member.setAge( resultSet.getInt("age") );
		member.setUserName(resultSet.getString(5));

		return member;
	}

}
