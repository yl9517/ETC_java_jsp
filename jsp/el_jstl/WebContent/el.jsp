<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>표현식</th> <th>결과</th>
			</tr>
		</thead>
		<tbody>
			<tr><td>\${1}</td> 				<td>${1}</td></tr>	
			<tr><td>\${1+2}</td> 			<td>${1+2}</td></tr>	
			<tr><td>\${1.2+2.1}</td> 		<td>${1.2+2.1}</td></tr>
			<tr><td>\${2-3}</td>			<td>${2-3}</td></tr>
			<tr><td>\${2*3}</td>			<td>${2*3}</td></tr>
			<tr><td>\${3 mod 2}</td>		<td>${3 mod 2}</td></tr>
			<tr><td>\${3 % 2}</td> 			<td>${3 % 2}</td></tr>
			<tr><td>\${3 / 2}</td>			<td>${3 / 2}</td></tr>
			<tr><td>\${(1==2)?1:2}</td> 	<td>${(1==2)?1:2}</td></tr>
			<tr><td>\${3 > 2}</td> 		    <td>${3 > 2}</td></tr>
			<tr><td>\${3 &gt; 2}</td>	    <td>${3 gt 2}</td></tr>
			<tr><td>\${3 == 2}</td> 		<td>${3 == 2}</td></tr>
			<tr><td>\${3 eq 2}</td> 		<td>${3 eq 2}</td></tr>
			<tr><td>\${3 != 2}</td>			<td>${3 != 2}</td></tr>
			<tr><td>\${3 ne 2}</td> 		<td>${3 ne 2}</td></tr>
		</tbody>
	</table>
	<br>
	<%="&gt;" %>
	<%="&le;" %>
</body>
</html>