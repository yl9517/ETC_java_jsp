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
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	if(id==null || pwd==null){
		response.sendRedirect("form.jsp");
	}
	else if(id.equals("aaa") && pwd.equals("123")){
		session.setAttribute("id", id);
		response.sendRedirect("list.jsp");
	}else{
		response.sendRedirect("form.jsp");
	}
%>

</body>
</html>