<%@page import="com.kosta.dto.EmpDTO"%>
<%@page import="com.kosta.dao.EmpDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	*{
		margin: 0;
		padding:0;
		box-sizing:border-box;
	}
	#wrap{
		width: 300px;
		margin: 30px auto;
		text-align: center;
	}
	input{
		padding: 5px 10px;
		margin-bottom: 10px;
	}
	input[readonly]{
		background-color: #F5F5F5;
		font-weight: border;
	}

	a{
		font-size: 12px;
	}
</style>
</head>
<body> 
<%
	int id = Integer.parseInt(request.getParameter("id"));


	EmpDAO dao = EmpDAO.getDAO();
	
	EmpDTO dto = dao.getOne(id);
%>

	<div id="wrap">
		<form method="post" action="updateAction.jsp">
			<label for="id">사원번호</label>
			<input type="text" id="id" name="id" value="<%=dto.getEmployee_id()%>" readonly> <br>
			<label for="id">이름</label>
			<input type="text" id="name" name="name" value="<%=dto.getFirst_name()%>"> <br>
			<label for="hire">입사일</label>
			<input type="text" id="hire" name="hire" value="<%=dto.getHire_date().substring(0,10)%>" readonly> <br>
			<label for="sal">연봉</label>
			<input type="text" id="sal" name="sal" value="<%=dto.getSalary()%>"> <br>
			<label for="id">부서코드</label>
			<input type="text" id="dept" name="dept" value="<%=dto.getDepartment_id()%>" > <br><br>	
			
			<input type="submit" value="수정"><br>
			
			<a href="deleteAction.jsp?id=<%=id %>">삭제</a>		
		</form>
	</div>
</body>
</html>