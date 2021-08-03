<%@page import="java.sql.SQLException"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
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
	Connection conn= null;
	try{
		Context initctx = new InitialContext();
//		Context envctx = (Context) initctx.lookup("java:comp/env");
//		DataSource ds = (DataSource) envctx.lookup("jdbc/kosta");
		DataSource ds = (DataSource)  initctx.lookup("java:comp/env/jdbc/kosta");

		conn = ds.getConnection();
		
		if(conn!=null){
			System.out.print("접속완료");
		}
	}catch(SQLException e){
		System.out.print(e);
	}finally{
		if(conn!=null) try{conn.close();} catch(Exception e){}
	}

%>
</body>
</html>