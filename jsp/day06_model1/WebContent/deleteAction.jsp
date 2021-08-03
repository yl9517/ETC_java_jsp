<%@page import="com.kosta.dao.EmpDAO"%>
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
	int id=Integer.parseInt(request.getParameter("id"));

	EmpDAO dao = EmpDAO.getDAO();
	int result =dao.deleteData(id);
	
	if(result==1){%>
		<script>
			alert('삭제완료');
			location.href="list.jsp";
		</script>
<%}else{%>
		<script>
			alert('삭제실패');
			location.href="detail.jsp?id="+id;
		</script>
<%	  }  %>
	
%>
</body>
</html>