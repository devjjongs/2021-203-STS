<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>memberList</title>
	
	<style>
	table {
	  font-family: arial, sans-serif;
	  border-collapse: collapse;
	  width: 100%;
	}
	
	td, th {
	  border: 1px solid #dddddd;
	  text-align: left;
	  padding: 8px;
	}
	
	tr:nth-child(even) {
	  background-color: #dddddd;
	}
	</style>



</head>
<body>
	어디서 호출했나 : ${msg }
	<br> ${memberList }
	<br>
	<c:forEach var="member" varStatus="stat" items="${memberList }">
		${stat.index } :  ${member.userId } ,  ${member.userName } , ${member.email }   <br>
	</c:forEach>

	<pre>
	
	
	
	</pre>

	<table border="1">
		<tr>
			<th>인덱스번호</th><th>아이디</th><th>이름</th><th>나이</th><th>이메일</th>
		</tr>
	    <c:forEach var="member" varStatus="stat" items="${memberList }">
		<tr>
			<td>${stat.index }</td>
			<td>${member.userId }</td>
			<td>${member.userName }</td>
			<td>${member.age }</td>
			<td>${member.email }</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>





















