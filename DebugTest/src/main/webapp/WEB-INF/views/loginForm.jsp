<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
</head>
<body>
	JDBC 이용 <br>
	<form action="loginCheck" method="post">
		<label for="userId">아이디:</label><input type="text" id="userId"	name="userId"><br> 
		<label for="userPw">암&nbsp;호:</label><input type="password" id="userPw" name="userPw"><br> 
		<input type="submit"><input type="reset">
	</form>
	 ORM 이용 <br>
	<form action="getMember" method="post">
		<label for="userId2">아이디:</label><input type="text" id="userId2"	name="xxx"><br> 
		<label for="userPw2">암&nbsp;호:</label><input type="password" id="userPw2" name="userPw"><br> 
		<input type="submit"><input type="reset">
	</form>
	
	 ORM findByColumn() call <br>
	<form action="findByColumn" method="get">
		<label for="column">검색할 column:</label><input type="text" id="column"	name="column"><br> 
		<label for="value">검색할value:</label><input type="text" id="value" name="value"><br> 
		<input type="submit"><input type="reset">
	</form>
	
	Member 객체 전달   call <br>
	<form action="memberInsert" method="post">
		<label for="userId4">userId4:</label><input type="text" id="userId4"	name="userId"><br> 
		<label for="userPw4">userPw4:</label><input type="password" id="userPw4" name="userPw"><br> 
		<label for="userName">userName:</label><input type="text" id="userName" name="userName"><br>
		<label for="email">email:</label><input type="email" id="email" name="email"><br>
		<label for="age">age:</label><input type="number" min="10" max="200" id="age" name="age" ><br>
		<input type="submit"><input type="reset">
	</form>
	
	
	
	
</body>
</html>