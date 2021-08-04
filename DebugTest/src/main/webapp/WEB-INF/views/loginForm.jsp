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
		<label for="userId">아이디&nbsp;:&nbsp;</label><input type="text" id="userId" name="userId"><br>
		<label for="userPw">암&nbsp;&nbsp;&nbsp;호&nbsp;:&nbsp;</label><input type="password" id="userPw" name="userPw"><br>
		<input type="submit" ><input type="reset">
	</form>
	
</body>
</html>