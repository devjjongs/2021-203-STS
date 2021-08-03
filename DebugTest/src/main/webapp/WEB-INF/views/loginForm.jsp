<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
</head>
<body>

	<form action="signUp" method="get">
		<label>=====회원가입=====</label><br>
		<label>아이디&nbsp;:&nbsp;</label><input type="text" id="userId" name="userId"><br>
		<label>암&nbsp;&nbsp;&nbsp;호&nbsp;:&nbsp;</label><input type="password" id="userPw" name="userId"><br>
		<label>이&nbsp;&nbsp;&nbsp;름&nbsp;:&nbsp;</label><input type="text" id="userName" name="userName"><br>
		<label>이메일&nbsp;:&nbsp;</label><input type="email" id="email" name="email"><br>
		<label>나&nbsp;&nbsp;&nbsp;이&nbsp;:&nbsp;</label><input type="number" id="age" name="age"><br>
		<input type="submit"><input type="reset">
	</form>

	<form action="loginCheck" method="post">
		<label>=====로그인=====</label><br>
		<label for="userId">아이디&nbsp;:&nbsp;</label><input type="text" id="userId" name="userId"><br>
		<label for="userPw">암&nbsp;&nbsp;&nbsp;호&nbsp;:&nbsp;</label><input type="password" id="userPw" name="userPw"><br>
		<input type="submit"><input type="reset">
	</form>

</body>
</html>