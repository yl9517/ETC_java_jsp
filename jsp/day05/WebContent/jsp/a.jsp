<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
a.jsp 화면입니다. <br>

<%
//	out.print("a.jsp 화면입니다."); 
	request.setCharacterEncoding("utf-8");

	String name=request.getParameter("name");
	String age=request.getParameter("age");
%>
		이름 <%=name %><br>
		나이 <%=age %>	
	
</body>
</html>