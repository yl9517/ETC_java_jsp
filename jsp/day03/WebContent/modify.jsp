<%@page import="java.sql.ResultSet"%>
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
	int empid = Integer.parseInt(request.getParameter("id"));
	
	String className="oracle.jdbc.OracleDriver";
	String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	String user = "hr";
	String pwd = "hr";
	
	StringBuilder sql = new StringBuilder();
	sql.append("select employee_id, first_name, salary,hire_date from emp where employee_id=? ");
	
	try{
		Class.forName(className);	
	}catch(ClassNotFoundException e){
		System.out.print(e);
	}
	
	ResultSet rs = null;	
	try(Connection conn = DriverManager.getConnection(url,user,pwd);
		PreparedStatement pstmt = conn.prepareStatement(sql.toString());  
	   ){
		pstmt.setInt(1, empid);

		rs = pstmt.executeQuery();
		
		if(rs.next()){%>
	<form method="post" action="modifyresult.jsp">
		<ul>
			<li>
				<label for="empid">사원번호</label>
				<input type="text" name="empid" id="empid" value=<%=rs.getInt("employee_id")%> readonly> <br>					
			</li>
			<li>
				<label for="ename">사원이름</label>
				<input type="text" name="ename" id="ename" value=<%=rs.getString("first_name") %>> <br>					
			</li>
			<li>
				<label for="sal">급여</label>
				<input type="text" name="sal" id="sal" value=<%=rs.getInt("salary") %>> <br>					
			</li>
			<li>
				<label for="hiredate">입사일</label>
				<input type="date" name="hiredate" id="hiredate" value=<%=rs.getDate("hire_date") %> readonly> <br>					
			</li>
			<li>
				<input type="submit" value="수정">
				<input type="reset" value="취소">				
			</li>
		</ul>
	</form>
		<%}
		
		
	}catch(SQLException e){
		System.out.print(e);
	}finally{
		if(rs!=null) try{rs.close();}catch(SQLException e){}
	}
%>


</body>
</html>