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

<c:set var="list" value="${requestScope.list }"></c:set>
	<table>
		<thead>
			<tr>
				<th>번호</th> <th>글제목</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="item" items="${list }">
				<tr>
					<td><c:out value="${item.boardno }"></c:out></td>
					<td><a href="detail.do?num=${item.boardno }"><c:out value="${item.boardtitle }"></c:out></a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<button id="addbtn"> 추가 </button>
	
</body>
</html>