<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
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
	int empid = Integer.parseInt(request.getParameter("id"));

	String className="oracle.jdbc.OracleDriver";
	String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	String user = "hr";
	String pwd = "hr";
	
	StringBuilder sql = new StringBuilder();
	sql.append("delete from emp where employee_id=?");
	
	try{
		Class.forName(className);	
	}catch(ClassNotFoundException e){
		System.out.print(e);
	}
	
	try(Connection conn = DriverManager.getConnection(url,user,pwd);
		PreparedStatement pstmt = conn.prepareStatement(sql.toString());  
	   ){
		pstmt.setInt(1, empid);

		pstmt.executeUpdate();
		
		response.sendRedirect("list.jsp"); //jsp에서 페이지이동
		
		
	}catch(SQLException e){
		System.out.print(e);
	}
	
%>
</body>
</html>