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
	String name="hong gil dong";
	int age = 10;
	String addr = "seoul";
	
	//표현하려면 scope로 묶어줘야함 (pageContext, request, session, application)
	pageContext.setAttribute("name", name);
	pageContext.setAttribute("addr", addr);
%>

	이름${name } <br>
	나이${age } <br>
	주소${addr } <br>
</body>
</html>