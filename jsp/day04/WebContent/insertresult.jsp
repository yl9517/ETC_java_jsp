<%@page import="com.kosta.dao.BoardDAO"%>
<%@page import="com.kosta.dto.BoardDTO"%>
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
	request.setCharacterEncoding("utf-8");
	String title= request.getParameter("title");
	String content= request.getParameter("content");
	String writer= request.getParameter("writer");
	
	BoardDTO dto = new BoardDTO();
	dto.setBtitle(title);
	dto.setBcontent(content);
	dto.setBwriter(writer);
	
	BoardDAO dao = new BoardDAO();
	
	int result = dao.addData(dto);
	
	if(result>0){%>
		<script>
			alert('자료 입력성공');
			location.href="list.jsp";
		</script>
	<%}else{%>
		<script>
			alert('자료 입력실패');
			location.href="insert.jsp";
		</script>
	<%}
	
%>

</body>
</html>