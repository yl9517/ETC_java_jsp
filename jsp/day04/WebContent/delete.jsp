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
	int result = dao.delDate(bno);
	
	if(result >0 ){ %>
		<script>
			alert('삭제 성공');
			location.href="list.jsp";
		</script>
	<%}else{%>
		<script>
			alert('삭제 실패');
			location.href="detail.jsp?bno="+bno;
		</script>
	<%}
%>
</body>
</html>