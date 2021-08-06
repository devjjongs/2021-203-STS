<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>

<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>	
	
	
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>login</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>	
	<script>
		/* $(document).ready(function(){ */
		$(function(){
		  $("button").click(function(){
		    $("p").hide();
		  });
		  
		  $("#save").click(function() {
			/* console.log("dfdfd");
			  alert($("#userId5").val()); */
			 // null check
			 
			 if($("#userId5").val().trim()==""){
				 alert("아이디을 입력하세요.");
                 $("#userId5").focus();
                 return false; 
			 }
			 if($("#userPw5").val().trim()==""){
				 alert("암호을 입력하세요.");
                 $("#userPw5").focus();
                 return false; 
			 }
			 if($("#userName5").val().trim()==""){
				 alert("이름을 입력하세요.");
                 $("#userName5").focus();
                 return false; 
			 }
			 
			 var paramDatas = {
				userId : $("#userId5").val(),
				userPw : $("#userPw5").val(),
				userName : $("#userName5").val(),
				email : $("#email5").val(),
				age : $("#age5").val()
			 };
			 
			 // ajax 
			 $.ajax({
				url : "memberInsertAjax"	 ,
				type : "post",
				datatype : "json",
				data : paramDatas,
				contentType :   "application/x-www-form-urlencoded; charset=UTF-8",
				success : function( retVal ) {
					/* if(retVal.code == "OK") { */
                        alert(retVal.message + " : " + );
                        location.href = retVal.nextpage;  
                    /* } else {
                        alert(retVal.message);
                    } */
				},
				error       :   function(request, status, error){
                     console.log("AJAX_ERROR"+" : "+error);
                 }
			 });
			 
			  
		  });
		  
		  
		  
		  
		  
		});
	</script>
</head>
<body>
	<h2>This is a heading</h2>
	
	<p>This is a paragraph.</p>
	<p>This is another paragraph.</p>
	
	<button>Click me</button>

	<pre>
	
	
	
	
	
	</pre>

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
		<label for="userName4">userName4:</label><input type="text" id="userName4" name="userName"><br>
		<label for="email4">email4:</label><input type="email" id="email4" name="email"><br>
		<label for="age4">age4:</label><input type="number" min="10" max="200" id="age4" name="age" ><br>
		<input type="submit"><input type="reset">
	</form>
	
	비동기적으로	Member 객체 전달   call <br>
	<form action="memberInsertAjax" method="post">
		<label for="userId5">userId5:</label><input type="text" id="userId5"	name="userId"><br> 
		<label for="userPw5">userPw5:</label><input type="password" id="userPw5" name="userPw"><br> 
		<label for="userName5">userName5:</label><input type="text" id="userName5" name="userName"><br>
		<label for="email5">email5:</label><input type="email" id="email5" name="email"><br>
		<label for="age5">age5:</label><input type="number" min="10" max="200" id="age5" name="age" ><br>
		<input type="button"  id="save" value="저장"><input type="reset">
	</form>
	
	
	
</body>
</html>