<%@page import="kr.or.kosta.dto.StudentDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
scope2
<%
	// [1. 보내준 자료 받기 ]
	//StudentDTO dto = (StudentDTO) pageContext.getAttribute("aaa");
  	StudentDTO dto = (StudentDTO) request.getAttribute("aaa");

	out.print(dto.getName());
	out.print(dto.getAge());
%>
	

</body>
</html>