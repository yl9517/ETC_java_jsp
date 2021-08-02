<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	b.jsp페이지입니다<br>
<%
	request.setCharacterEncoding("utf-8");
	
	String name=request.getParameter("name");
		name=URLDecoder.decode(name,"utf-8"); //인코딩 된 것은 디코딩으로 풀어주기
	
	String age=request.getParameter("age");
%>
		이름 <%=name %><br>
		나이 <%=age %>	
</body>
</html>