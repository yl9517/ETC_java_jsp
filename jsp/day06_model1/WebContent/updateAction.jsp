<%@page import="com.kosta.dao.EmpDAO"%>
<%@page import="com.kosta.dto.EmpDTO"%>
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

	int id = Integer.parseInt(request.getParameter("id"));
	String name = request.getParameter("name");
	int sal = Integer.parseInt(request.getParameter("sal"));
	int dept = Integer.parseInt(request.getParameter("dept"));
	 
	EmpDTO dto = new EmpDTO(id,name,"",sal,dept);

	EmpDAO dao = EmpDAO.getDAO();
	int result = dao.modifyData(dto);

	if(result==1){%>
		<script>
			alert('수정완료');
			location.href="list.jsp";
		</script>
<%}else{%>
		<script>
			alert('수정실패');
			location.href="detail.jsp?id="+id;
		</script>
<%	  }  %>
%>
</body>
</html>