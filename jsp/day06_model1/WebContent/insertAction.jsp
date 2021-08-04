
<%@page import="com.kosta.dto.EmpDTO"%>
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
	request.setCharacterEncoding("utf-8");

	int id = Integer.parseInt(request.getParameter("id"));
	String name = request.getParameter("name");
	String hire = request.getParameter("hire");
	int sal = 0;
	try{
		sal =Integer.parseInt(request.getParameter("sal"));
	}catch(Exception e){
		
	}
	int dept = Integer.parseInt(request.getParameter("dept"));
	
	EmpDTO dto = new EmpDTO(id,name,hire,sal,dept);
	
	EmpDAO dao = EmpDAO.getDAO();
	int result = dao.saveData(dto);
	
	if(result==1){%>
		<script>
			alert('저장완료');
			location.href="list.jsp";
		</script>
	<%}else{%>
		<script>
			alert('저장실패');
			location.href="insert.jsp";
		</script>
<%	  }  %>
</body>
</html>