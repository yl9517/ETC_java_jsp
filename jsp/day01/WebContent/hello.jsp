<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">  <!-- utf-8로 설정 -->
<title>Insert title here</title>
</head>
<body>

<%="안녕하세요" %><br>
<%
	String name="홍길동";
	int age =20;
%>
당신의 이름은 <%=name %><br>
나이는 <%=age %><br>

</body>
</html>