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
<style>
	ul li{
		list-style: none;
	}
	ul li label{
		display:inline-block;
		margin: 3px;
	}
</style>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script src="js/sub_detail.js"></script>
</head>
<body>
<%	int empid= Integer.parseInt(request.getParameter("id"));

	String className="oracle.jdbc.OracleDriver";
	String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	String user = "hr";
	String pwd = "hr";
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	StringBuilder sql = new StringBuilder();
	sql.append("select employee_id, first_name, salary, hire_date");
	sql.append(" from emp ");
	sql.append("where employee_id=?");
	
	
	try{
		Class.forName(className);
		conn = DriverManager.getConnection(url,user,pwd);
		
		pstmt = conn.prepareStatement(sql.toString());
		pstmt.setInt(1, empid);
		
		rs = pstmt.executeQuery();
		%>
		<ul>
		<% 
		if(rs.next()){%>
			<li> <label>사원번호 :</label> <%=rs.getInt("employee_id") %> </li> <!-- 이미 올떄 받은 empid를 가져와도 됨 -->
			<li> <label>이름 :</label> <%=rs.getString("first_name") %> </li>
			<li> <label>연봉 :</label> <%=rs.getInt("salary") %> </li>
			<li> <label>입사일 :</label> <%=rs.getDate("hire_date") %> </li>	<!-- getString으로 받을수도 있음 -->	
	<%  } %>
		</ul>
		<input type="button" id="modify" value="수정" onclick="modify(<%=empid%>)">
		<input type="button" id="del" value="삭제">
	
	<%
	}catch(ClassNotFoundException e){
		System.out.println(e);
	}finally{
		if(rs!=null) try{ rs.close(); }catch(SQLException e){}
		if(pstmt!=null) try{ pstmt.close(); }catch(SQLException e){}
		if(conn!=null) try{ conn.close(); }catch(SQLException e){}
	}
%>


</body>
</html>