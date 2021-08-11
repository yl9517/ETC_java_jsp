<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/list.css">
</head>
<body>
<%
//el과 jstl 사용해서 받아올 것
%>
	<c:set var="emplist" value="${requestScope.emplist}"></c:set>
	<c:set var="datacount" value="${requestScope.datacount}"></c:set>
	
	<!-- 페이징 -->
	<c:set var="currpage" value="${requestScope.currpage}"></c:set>
	<c:set var="totalPage" value="${requestScope.totalPage}"></c:set>
	<c:set var="startblock" value="${requestScope.startblock}"></c:set>
	<c:set var="endblock" value="${requestScope.endblock}"></c:set>
	
	<!-- 검색 -->
	<c:set var="search" value="${requestScope.search}"></c:set>
	<c:set var="searchtxt" value="${requestScope.searchtxt}"></c:set>
	
<%-- 	<c:out value="${currpage}"></c:out>
	<c:out value="${datacount}"></c:out>
  --%>
	<table>
		<thead>
			<tr>
				<th>사원번호</th> <th>이름</th> <th>이메일</th> <th>급여</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="item" items="${emplist}">
				<tr>
					<td> <c:out value="${item.employee_id}"></c:out> </td>
					<td> <c:out value="${item.first_name}"></c:out> </td>
					<td> <c:out value="${item.email}"></c:out> </td>
					<td> <c:out value="${item.salary}"></c:out> </td>
				</tr>
			</c:forEach>	
		</tbody>
	</table> 
	<div class="page1">
		<c:if test="${startblock > 1}">
				<a href="list.do?curr=${currpage-1}&search=${search}&searchtxt=${searchtxt}">이전</a>
		</c:if>
	</div>
	<div class="page2">
		<c:forEach var="i" begin="${startblock}" end="${endblock}">
			<c:choose>
				<c:when test="${currpage == i }">
					<c:out value="${i }"></c:out>
				</c:when>
				<c:otherwise>
					<a href="list.do?curr=${i}&search=${search}&searchtxt=${searchtxt}"><c:out value="${i }"></c:out></a>
				</c:otherwise>
			</c:choose>
		</c:forEach>
	</div>
	<div class="page3">	
		<c:if test="${currpage < totalPage }">
				<a href="list.do?curr=${currpage+1}&search=${search}&searchtxt=${searchtxt}">다음</a>	
		</c:if>
	</div>
  <!-- 마지막블록이 토탈페이지보다 높다면   마지막블록은 토탈페이지로 설정은 ListAction에서 -->
 	<div class="clear"></div>
 	<div class="search">
	 	<form method="get" action="list.do">
	 		<select name="search">
	 			<option value="employee_id">사원번호</option>
	 			<option value="first_name">사원명</option>
	 			<option value="email">이메일</option>
	 		</select>
	 		<input type="text" name="searchtxt">
	 		<input type="submit" value="검색">
	 	</form>
	</div>
	
</body>
</html>