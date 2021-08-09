package com.bit.spring.model.orm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import com.bit.spring.model.orm.vo.Member;
/**
 * MemberDaoMyBatis  ==> MemberMapper
 * MemberMapper.xml 와 메소드와 아이디를 연결해서 쿼리를 던지고 결과 받는 것을 자동으로 처리하기 위한 준비
 * @author bitcamp
 *
 */
@Service
public interface MemberDaoMyBatis {
	List<Member>  getAllMember();
	Member getMember(@Param("userId") String userId , @Param("userPw") String userPw);
	//가입
	//탈퇴
	//정보수정
	//이름 검색 김말자 , 이말자 
	
	/**
	 * ~~Mapper.xml을 사용하지 않고 메소드명위에 @으로 query문 사용
	 */
	@Select("select * from member where ${column} = #{value}")
	List<Member> findByColumn(@Param("column") String column, @Param("value") String value);
	
	// 회원 정보 insert 메소드 
	void memberInsert(Member member );
}
