<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
</head>
<body>

	JDBC 이용<br>
	<form action="loginCheck" method="post">
		<label for="userId">아이디&nbsp;:&nbsp;</label><input type="text" id="userId" name="userId"><br>
		<label for="userPw">암&nbsp;&nbsp;&nbsp;호&nbsp;:&nbsp;</label><input type="password" id="userPw" name="userPw"><br>
		<input type="submit" ><input type="reset">
	</form>
	
	ORM MyBatis 이용<br>
	<form action="getMember" method="post">
		<label for="userId2">아이디&nbsp;:&nbsp;</label><input type="text" id="userId2" name="userId"><br>
		<label for="userPw2">암&nbsp;&nbsp;&nbsp;호&nbsp;:&nbsp;</label><input type="password" id="userPw2" name="userPw"><br>
		<input type="submit" ><input type="reset">
	</form>
	
	ORM findByColumn() call<br>
	<form action="findByColumn" method="get"> <!-- method="get"은 생략해도 get -->
		<label for="Column">검색할&nbsp;Column&nbsp;:&nbsp;</label><input type="text" id="Column" name="Column"><br>
		<label for="value">검색할&nbsp;value&nbsp;:&nbsp;</label><input type="text" id="value" name="value"><br>
		<input type="submit" ><input type="reset">
	</form>
	
</body>
</html>