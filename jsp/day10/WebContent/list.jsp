<%@page import="java.util.ArrayList"%>
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
	ArrayList<String> arr = new ArrayList<>();
	arr.add("김진경");
	arr.add("이철종");
	arr.add("이수현");
	arr.add("김원겸");

%>
 <table>
 	<thead>
 		<tr>
 			<th>이름</th>
 		</tr>
 	</thead>
 	<tbody>
<%
	for(String name:arr){
%>		<tr> <td><%=name %> </td></tr>
<%  } %>
 	</tbody>
 </table>
</body>
</html>