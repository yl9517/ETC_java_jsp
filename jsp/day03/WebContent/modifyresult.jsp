<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
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

		int empid = Integer.parseInt(request.getParameter("empid"));
		String ename = request.getParameter("ename");
		int sal = Integer.parseInt(request.getParameter("sal"));
		
		String className="oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String user = "hr";
		String pwd = "hr";
		
		StringBuilder sql = new StringBuilder();
		
		sql.append("update emp set first_name=?, salary = ?, hire_date=sysdate where employee_id =?");
		
		try{
			Class.forName(className);
		}catch(ClassNotFoundException e){
			System.out.print(e);
		}
		
		int result=0;
		try(Connection conn = DriverManager.getConnection(url,user,pwd);
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			){
			pstmt.setString(1,ename);
			pstmt.setInt(2,sal);
			pstmt.setInt(3,empid);
			
			result = pstmt.executeUpdate();
			
			if(result>0){%>
				<script>
					alert('수정성공');
					location.href="list.jsp"
				</script>
			<%}else{%>
				<script>
					alert('수정성공');
					location.href="modify.jsp?id="+empid;
				</script>
			<%}
			
			
		}catch(SQLException e){%>
			<script>
				alert('수정실패!!');
				location.href="modify.jsp?id="+empid;
			</script>
		<%}
%>
</body>
</html>