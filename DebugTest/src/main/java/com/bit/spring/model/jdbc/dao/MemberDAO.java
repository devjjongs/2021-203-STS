package com.bit.spring.model.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bit.spring.model.jdbc.vo.Member;

//  oracle db connection
//  stream 부여받는다
//  crud 명령처리하고 결과를 리턴
public class MemberDAO     {
	
	private Connection connection ;
	
	
	public MemberDAO() {
		connection();
	}
	
//  oracle db connection
//  stream 부여받는다
	public void  connection() {
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="spring";
			String password="1234";
			connection = DriverManager.getConnection(url, user, password);
			System.out.println("connection ok");
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
//  crud 명령처리하고 결과를 리턴
	//select id pw 존재?  member instance 리턴
	public  Member loginCheck(String userId, String userPw) {
		Member member = null;
		String sql ="select email, age, userName  from  member  where  userId =? and userPw = ? ";
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, userId);
			preparedStatement.setString(2, userPw);
			resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				member = new Member();
				member.setUserId(userId);
				member.setUserPw(userPw);
				member.setEmail(  resultSet.getString(1) );
				member.setAge( resultSet.getInt("age") );
				member.setUserName(resultSet.getString(3));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return  member ;
	}
	
	// member list return
	
	public List<Member> memberList(/* String userId, String userPw */) {
		List<Member>memberList = null;
//		Member member = null;
		String sql ="select userId ,userPw , email, age, userName  from  member  ";
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			preparedStatement = connection.prepareStatement(sql);
//			preparedStatement.setString(1, userId);
//			preparedStatement.setString(2, userPw);
			resultSet = preparedStatement.executeQuery();
			memberList = new ArrayList<Member>();
			
			while(resultSet.next()) {
//				Member  member = new Member();
//				member.setUserId(resultSet.getString(1));
//				member.setUserPw(resultSet.getString(2));
//				member.setEmail(  resultSet.getString("email") );
//				member.setAge( resultSet.getInt("age") );
//				member.setUserName(resultSet.getString(5));
//				
//				memberList.add(member);
				
				
				memberList.add(
						new Member(
								resultSet.getString(1), 
								resultSet.getString(2), 
								resultSet.getString(5),  
								resultSet.getString("email"), 
								resultSet.getInt("age")));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return  memberList ;
	}
	
	
	
	
	//   스트림과  connection을 정리해야 한다
	
}
