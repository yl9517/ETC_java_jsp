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
	String id= (String)session.getAttribute("id");

	if(id==null){
		response.sendRedirect("form.jsp");
	}else{
		out.print(id+"님 환영합니다. <br>");
		out.print("list화면입니다. <br>");
	}
%>
<a href="list2.jsp">또 다른 화면</a>


</body>
</html>