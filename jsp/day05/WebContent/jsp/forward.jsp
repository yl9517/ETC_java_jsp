<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	forward화면입니다.
<%
	String name=URLEncoder.encode("홍","utf-8"); //인코딩처리
%>
	<!-- forward : 자기가 처리할건 아닌데 일단 받고, 해당 담당자한테 넘기고 응답받으면 여기서 출력 -->
	<jsp:forward page="b.jsp">	
		<jsp:param value="<%=name %>" name="name"/>
		<jsp:param value="10" name="age"/>
	</jsp:forward>


</body>
</html>