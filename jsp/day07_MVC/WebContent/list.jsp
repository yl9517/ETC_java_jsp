<%@page import="kr.or.kosta.dto.BoardDTO"%>
<%@page import="java.util.List"%>
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
	List<BoardDTO> list = (List<BoardDTO>) request.getAttribute("list");
%>
<table>
	<thead>
		<tr>
			<th>글번호</th>
			<th>글제목</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>조회수</th>
		</tr>
	</thead>
	<tbody>
<%
	for(BoardDTO dto:list){
%>
		<tr>
			<td><%=dto.getBno() %></td>
			<td><a href="detail.do?bno=<%=dto.getBno()%>"><%=dto.getBtitle() %></a></td>
			<td><%=dto.getBwriter() %></td>
			<td><%=dto.getBwritedate() %></td>
			<td><%=dto.getBreadno() %></td>
		</tr>
<% } %>
	</tbody>

</table>
	<a href="insert.do"> 글쓰기 </a>
</body>
</html>