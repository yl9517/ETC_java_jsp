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
	request.setCharacterEncoding("utf-8");
	
	int bno = Integer.parseInt(request.getParameter("bno"));
	
	String title = request.getParameter("title");
	String content = request.getParameter("content");
	String writer = request.getParameter("writer");
	
	BoardDTO dto = new BoardDTO();
	dto.setBno(bno);
	dto.setBtitle(title);
	dto.setBcontent(content);
	dto.setBwriter(writer);
	
	BoardDAO dao = new BoardDAO();
	int result = dao.modifyData(dto);
	
	if(result>0){%>
		<script>
			alert('수정 성공');
			location.href="list.jsp"; //왜 detail로 안가지는지?
		</script>
	<%}else{%>
		<script>
			alert('수정 실패');
			location.href="modify.jsp?bno="+bno;
		</script>
	<%}
%>


</body>
</html>