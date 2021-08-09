<%@page import="org.apache.jasper.tagplugins.jstl.core.Param"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<fmt:requestEncoding value="utf-8"/>
<c:set var="name" value="${param.name}"></c:set>
<c:set var="kor" value="${param.kor}"></c:set>
<c:set var="eng" value="${param.eng}"></c:set>
<c:set var="math" value="${param.math}"></c:set>

이름 : <c:out value="${name}"></c:out><br>
국어 : <c:out value="${kor}"></c:out><br>
영어 : <c:out value="${eng}"></c:out><br>
수학 : <c:out value="${math}"></c:out><br>

</body>
</html>