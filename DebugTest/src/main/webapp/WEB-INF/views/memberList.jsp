<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>memberList</title>
</head>
<body>
	어디서 호출했나 : ${msg }
	<br> ${memberList }
	<br>
	<c:forEach var="member" varStatus="stat" items="${memberList }">
		${stat.index} : ${member.userId } , ${member.userName }, ${member.email }<br>
	</c:forEach>

	<pre>




	</pre>

	<table border="1">
		<tr>
			<th>인덱스 번호</th>
			<th>아이디</th>
			<th>이름</th>
			<th>나이</th>
			<th>이메일</th>
		</tr>
		<c:forEach var="member" varStatus="stat" items="${memberList }">
			<tr>
				<td>${stat.index}</td>
				<td>${member.userId}</td>
				<td>${member.userName}</td>
				<td>${member.age}</td>
				<td>${member.email}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>