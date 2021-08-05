<%@page import="kr.or.kosta.dto.BoardDTO"%>
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
	BoardDTO dto = (BoardDTO) request.getAttribute("dto");
		
%>
<ul>
	<li>
		<label>글번호</label>
		<%=dto.getBno() %>
	</li>
	<li>
		<label>글제목</label>
		<%=dto.getBtitle() %>
	</li>
	<li>
		<label>글 내용</label>
		<%=dto.getBcontent() %>
	</li>
	<li>
		<label>작성자</label>
		<%=dto.getBwriter() %>
	</li>
	<li>
		<label>작성일</label>
		<%=dto.getBwritedate() %>
	</li>
	<li>
		<label>조회수</label>
		<%=dto.getBreadno() %>
	</li>
</ul>
<a href="list.do">목록으로</a>
<a href="del.do?bno=<%=dto.getBno() %>">삭제</a>
<a href="modify.do?bno=<%=dto.getBno() %>">수정</a>

</body>
</html>