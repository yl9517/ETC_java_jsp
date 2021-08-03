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
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	
	if ("aaa".equals(id) && "123".equals(pwd)){
		Cookie cook= new Cookie("id",id);
		cook.setMaxAge(60*60*5);  //쿠키 유효시간 (초단위)		=> 5시간
		response.addCookie(cook);  //쿠키 저장 해야함
		response.sendRedirect("cookielist.jsp");
		
	}else{
		response.sendRedirect("cookieform.jsp");
	}
%>
</body>
</html>