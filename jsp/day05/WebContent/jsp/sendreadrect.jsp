
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
<!-- page 이동시 forward방식과 sendredirect 방식 -->
<%
	out.print("sendredirect.jsp 화면입니다. ");  //출력문 없이 바로 이동함
	String name=URLEncoder.encode("홍","utf-8");

	response.sendRedirect("a.jsp?name="+name+"&age=10");  //여기서 처리 안해요 a.jsp로 가세요
	

%>



</body>
</html>