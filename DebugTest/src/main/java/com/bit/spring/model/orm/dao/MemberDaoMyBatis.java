package com.bit.spring.model.orm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import com.bit.spring.model.orm.vo.Member;

/**
 * 
 * MemberDaoMyBatis ==> MemberMapper와 연결되는 인터페이스 MemberMapper.xml 과 메소드와 아이디를
 * 연결해서 쿼리를 던지고 결과를 받는 것을 자동으로 처리하기 위한 준비
 * 
 * @author JJong
 *
 */
@Service
public interface MemberDaoMyBatis {
	List<Member> getAllMember(); // 회원조회 메소드

	Member getMember(@Param("userId") String userId, @Param("userPw") String userPw); // 로그인 체크 메소드
	// 회원가입 메소드
	// 회원탈퇴 메소드
	// 정보수정 메소드
	// 이름검색 메소드
}