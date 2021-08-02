<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
</head>
<body>
	
	
	<form action="loginCheck" method="post"><!-- action을 비워두면 자기 자신이 다시 호출 -->
		<label for="userName">아이디 : </label><input type="text" id="userName" name="userName"><br> <!-- id와 name은 동일하게 써주는게 더 좋음 -->
		<label for="userPw">암&nbsp;호 : </label><input type="password" id="userPw" name="userPw"><br>
		<input type="submit"><input type="reset">
	</form>
	
	
</body>
</html>