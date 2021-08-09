<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");
%>

아이디 : ${param.id }<br>
패스워드 : ${param.pwd }<br>
좋아하는 음식 : <br>
 ${paramValues.favfood[0] } <br>
 ${paramValues.favfood[1] } <br>
 ${paramValues.favfood[2] } <br>
 ${paramValues.favfood[3] } <br>
</body>
</html>