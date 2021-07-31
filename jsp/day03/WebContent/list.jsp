<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/list.css">
</head>
<body>
<table>
	<thead>
		<tr>
			<th>사원번호</th>
			<th>이름</th>
			<th>급여</th>
			<th>입사일</th>
		</tr>
	</thead>
	<tbody>
	<%
		String className="oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String user = "hr";
		String pwd = "hr";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		
		StringBuilder sql = new StringBuilder();
		sql.append("select employee_id, first_name, salary ,hire_date");
		sql.append(" from emp ");
		
		try{
			
			Class.forName(className);
			conn = DriverManager.getConnection(url,user,pwd);
			
			pstmt = conn.prepareStatement(sql.toString());
			
			rs = pstmt.executeQuery();
			while(rs.next()){ %>
				<tr>
					<td><%=rs.getInt("employee_id") %></td>
					<td><a href="detail.jsp?id=<%=rs.getInt("employee_id")%>"><%=rs.getString("first_name") %> </a></td>
					<td><%=rs.getInt("salary") %></td>
					<td><%=rs.getDate("hire_date") %></td>
				</tr>
				
			<%}
			
		}
		catch(ClassNotFoundException e){
			
		}finally{
			if(rs!=null) try{ rs.close(); }catch(SQLException e){}
			if(pstmt!=null) try{ pstmt.close(); }catch(SQLException e){}
			if(conn!=null) try{ conn.close(); }catch(SQLException e){}
		}

	%>	

	
	</tbody>
</table>

<a href="insert.jsp">회원추가</a>


</body>
</html>