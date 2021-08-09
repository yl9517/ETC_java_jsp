<%@page import="javax.security.auth.message.callback.PrivateKeyCallback.Request"%>
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
	int result =0;

	for(int i=0; i<10; i++){
		result += i;
	}
	// 표현하려면 scope로 묶어줘야함 (pageContext, request, session, application)
	
	request.setAttribute("result", result);
	
	//자료넘기기
	RequestDispatcher disp = request.getRequestDispatcher("el3_1.jsp");
	disp.forward(request, response);
	
%>
	

</body>
</html>