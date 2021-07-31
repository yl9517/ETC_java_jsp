<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Driver"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Date"%>
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
	request.setCharacterEncoding("UTF-8");
	String ename=request.getParameter("ename");

	String s=request.getParameter("sal");
	int sal;
	try{;
		sal =  Integer.parseInt(s);
	}catch(NumberFormatException e){
		sal =0;
	}
	String hiredate=request.getParameter("hiredate");
%>
<%	

	String className="oracle.jdbc.OracleDriver";
	String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	String user = "hr";
	String pwd = "hr";
	
	Connection conn= null;
	PreparedStatement pstmt = null;
	StringBuilder sql = new StringBuilder();
	
	sql.append("insert into emp(employee_id, first_name,salary, hire_date) ");
	sql.append(" values(seq1.nextval, ?,?,?)");
	
	
	try{
		conn = DriverManager.getConnection(url,user,pwd);
		pstmt = conn.prepareStatement(sql.toString());
		
		pstmt.setString(1, ename);
		pstmt.setInt(2, sal);
		pstmt.setString(3,hiredate);
		
		int result = pstmt.executeUpdate(); 
		
		if(result>0){ %>
			
			<script>
				alert('입력성공');
				location.href="list.jsp";
			</script>
	<% } else{ %>
			<script>
				alert('입력실패');
				location.href="insert.jsp";
			</script>
	<% }
	}catch(SQLException e){%>
			<script>
				alert('입력실패');
				location.href="insert.jsp";
			</script>
	<%}finally{
		if(pstmt!=null) try{ pstmt.close(); } catch(SQLException e){}
		if(conn!=null) try{ conn.close(); } catch(SQLException e){}
	}
		
	
	
%>
</body>
</html>