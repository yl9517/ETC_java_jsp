<%@page import="kr.or.kosta.dto.EmpDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script src="js/emp.js"></script>

</head>
<body>
	<input type="button" id="add" value="내용 추가">
	<table>
		<thead>
			<tr>
				<th>사원번호</th>
				<th>사원명</th>
				<th>직책</th>
				<th>급여</th>
				<th>입사일</th>
			</tr>
		</thead>	
		<tbody>
<%
		List<EmpDTO> list = (List<EmpDTO>) request.getAttribute("list");

		for(EmpDTO dto:list){   %>	
			<tr>
				<td><%=dto.getEmpno() %></td>
				<td><a href="detail.kosta"><%=dto.getEname() %></a></td>
				<td><%=dto.getJob() %></td>
				<td><%=dto.getSal() %></td>
				<td><%=dto.getHiredate() %></td>
			</tr>
<% 		}  %>
		</tbody>
	</table>
</body>
</html>