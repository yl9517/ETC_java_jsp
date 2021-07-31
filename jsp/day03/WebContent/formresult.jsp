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
	request.setCharacterEncoding("UTF-8");
	String name = request.getParameter("name");
	String age = request.getParameter("age");
	String[] fav =request.getParameterValues("fav");
	
%>
	이름 : <%=name %> <br>
	나이 : <%=age %> <br>
	좋아하는 음식 :
	<%
		for(String item:fav){	
	%>
		<%=item+" " %>
	<%
	}
	%>

</body>
</html>