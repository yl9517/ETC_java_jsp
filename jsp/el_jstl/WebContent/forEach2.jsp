<%@page import="java.util.HashMap"%>
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
<!-- 
	코어 라이브러리 : 변수선언, if, for 등의 제어흐름, url 처리등에서 사용
	forEach 반복문 : 배열, collection 또는 map에 처리 되어있는 값을 순차적으로 처리할때
 -->
 	<c:set var="sum" value="0"></c:set>  <!-- int sum = 0 과 같음 -->
 	<c:forEach var="i" begin="1" end="10" step="2">
 		<c:set var="sum" value="${sum+i}"></c:set>
 	</c:forEach>
 	
 	결과는 <c:out value="${sum}"></c:out> <br>
 	
 	
 <%
 	ArrayList<String> arr= new ArrayList<>();
 
 	arr.add("a1");
 	arr.add("a2");
 	arr.add("a3");
 		
 	request.setAttribute("arr", arr);
 %>
 
 	<c:forEach var="item" items="${arr}">
 		<c:out value="${item}"></c:out> 	
 	</c:forEach>
 	
 	<br>
 	<hr>
<%
	HashMap<Integer,String> hm = new HashMap<>();
	hm.put(10,"hong");
	hm.put(20,"kim");
	hm.put(30,"lee");
	hm.put(40,"han");
	
	request.setAttribute("hm", hm); //묶어주기
%>

	<c:forEach var="i" items="${hm}">
		<c:out value="${i.key}"></c:out>
		<c:out value="${i.value}"></c:out> <br>
	</c:forEach>
</body>
</html>