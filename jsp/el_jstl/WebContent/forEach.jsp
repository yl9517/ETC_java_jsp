<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		ArrayList<String> arr = new ArrayList<>();
		arr.add("hong");
		arr.add("kim");
		arr.add("lee");
		arr.add("park");
		
		request.setAttribute("arr", arr);
	%>
	<c:forEach var="item" items="${arr}" varStatus="idx">
		<c:out value="${idx.index}"></c:out>
		<c:out value="${item}"></c:out>
	</c:forEach>
	
	<br>
	
	<c:set var="arr2" value="a1,a2,a3,a4"></c:set>
	<c:forEach var="item2" items="${arr2}">
		<c:out value="${item2}"></c:out>
	</c:forEach>
	
	<br>
	
	<c:forEach var="item3" begin="1" end="10" step="2">
		<c:out value="${item3 }"></c:out>
	</c:forEach>
	
	<br>
	
	<c:forEach var="item4" items="${arr}" begin="1" end="2"> <!-- 1~2번째 인덱스 -->
		<c:out value="${item4}"></c:out>
	</c:forEach>

</body>
</html>