<%@page import="kr.or.kosta.dto.EmpDTO"%>
<%@page import="java.util.List"%>
<%@page import="kr.or.kosta.dao.EmpDAO"%>
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
	EmpDAO dao= EmpDAO.instance();
	List<EmpDTO> dto = dao.getList();
	
%>
	<table>
		<thead>
			<tr>
				<th>사원번호</th>
				<th>이름</th>
				<th>입사일</th>
				<th>급여</th>
				<th>부서코드</th>
			</tr>
		</thead>
		<tbody>
<%
	for(EmpDTO list:dto){
%>	
			<tr>
				<td><%=list.getEmployee_id() %></td>
				<td><%=list.getFirst_name() %></td>
				<td><%=list.getHire_date() %></td>
				<td><%=list.getSalary() %></td>
				<td><%=list.getDepartment_id() %></td>
			</tr>
<%  } %>
		</tbody>
	</table>

</body>
</html>