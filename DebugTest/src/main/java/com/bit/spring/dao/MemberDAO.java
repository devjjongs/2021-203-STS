package com.bit.spring.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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

}
