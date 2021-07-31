<%@page import="com.kosta.dto.BoardDTO"%>
<%@page import="com.kosta.dao.BoardDAO"%>
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
	int bno =Integer.parseInt(request.getParameter("bno"));

	BoardDAO dao = new BoardDAO();
	BoardDTO dto = dao.getone(bno);
%>
	<form method="post" action="modifyresult.jsp?bno=<%=dto.getBno()%>">
		<label for="title">글제목</label>
		<input type="text" name="title" id="title" value="<%=dto.getBtitle() %>"> <br>
		<label for="content">글내용</label> <br>
		<textarea id="content" name="content" rows="5" cols="60"><%=dto.getBcontent() %></textarea> <br>
		<label for="writer">작성자</label>
		<input type="text" name="writer" id="writer" value="<%=dto.getBwriter() %>"> <br>
		
		<input type="submit" value="수정">
		<input type="reset" value="취소">
	</form>
	
</body>
</html>