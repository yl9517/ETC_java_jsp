<%@page import="java.util.List"%>
<%@page import="com.kosta.dto.BoardDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.kosta.dao.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script src="js/board.js"></script>
</head>
<body>
<%
	BoardDAO dao = new BoardDAO();

	List<BoardDTO> list =  dao.getList();
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
		for(BoardDTO dto:list){%>
			<tr>
				<td><%=dto.getBno() %></td>
				<td><a href="detail.jsp?bno=<%=dto.getBno()%>"><%=dto.getBtitle() %></a></td>
				<td><%=dto.getBwriter() %></td>
				<td><%=dto.getBwritedate() %></td>
				<td><%=dto.getBreadno() %></td>
			</tr>	
	<%	}
	%>
		</tbody>
	</table>
	<input type="button" id="btnwrite" value="글쓰기"> 
</body>
</html>
