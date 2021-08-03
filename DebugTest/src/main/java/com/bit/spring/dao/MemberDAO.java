package com.bit.spring.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bit.spring.vo.Member;

//  oracle db connection
//  stream 부여받는다
//  crud 명령처리하고 결과를 리턴
public class MemberDAO {

	private Connection connection;

//  oracle db connection
//  stream 부여받는다
	public void connection() {
		
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "tiger";
			connection = DriverManager.getConnection(url, user, password);
			System.out.println("connection ok");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

//  crud 명령처리하고 결과를 리턴
	// select id pw 존재? member instance 리턴
	public Member loginCheck(String userId, String userPw) {
		Member member = null;
		String sql = "select email, age, userName  from  member  where  userId =? and userPw = ? ";
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, userId);
			preparedStatement.setString(2, userPw);
			resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				member = new Member();
				member.setUserId(userId);
				member.setUserPw(userPw);
				member.setEmail(resultSet.getString(1));
				member.setAge(resultSet.getInt("age"));
				member.setUserName(resultSet.getString(3));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return member;
	}
	// 스트림과 connection을 정리해야 한다

	// MemberList 출력
	public List<Member> memberList(/* String userId, String userName */) {
		List<Member> memberList = null;
//		Member member = null;
		String sql = "select userId, userPw, email, userName, age from member";
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			memberList = new ArrayList<Member>();
			while (resultSet.next()) {
//				Member member = new Member();
//				member.setUserId(resultSet.getString(1));
//				member.setUserPw(resultSet.getString(2));
//				member.setEmail(resultSet.getString("email"));
//				member.setUserName(resultSet.getString(4));
//				member.setAge(resultSet.getInt("age"));
//
//				memberList.add(member);

				// single
				memberList.add(new Member(resultSet.getString(1), resultSet.getString(2), resultSet.getString("email"),
						resultSet.getString(4), resultSet.getInt("age")));
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return memberList();
	}

	// 회원가입
	public Member signUp(String userId, String userPw, String userName, String email, Integer age) {
		Member member = null;
		String sql = "insert into member(userId, userPw, userName, email, age) values(?,?,?,?,?)";
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, userId);
			preparedStatement.setString(2, userPw);
			preparedStatement.setString(3, userName);
			preparedStatement.setString(4, email);
			preparedStatement.setInt(5, age);
			resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				member = new Member();
				member.setUserId(userId);
				member.setUserPw(userPw);
				member.setUserName(userName);
				member.setEmail(email);
				member.setAge(age);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return member;
	}

	// 회원 탈퇴
	public void deleteMember(String userId, String userPw) {
		Member member = null;
		String sql = "delete from member where userId=? and userPw =?";
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, userId);
			preparedStatement.setString(2, userPw);
			resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {

			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}