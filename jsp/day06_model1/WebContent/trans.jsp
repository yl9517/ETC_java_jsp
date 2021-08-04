<%@page import="javax.sql.DataSource"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="javax.naming.NamingException"%>
<%@page import="java.sql.SQLException"%>
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
	Connection conn = null;
	PreparedStatement pstmt = null;
	try {  // DBCP 방식
		Context initctx = new InitialContext();
		DataSource ds = (DataSource) initctx.lookup("java:comp/env/jdbc/kosta");
		conn = ds.getConnection();
		conn.setAutoCommit(false); //자동커밋 되지 않도록
		
		StringBuilder sql = new StringBuilder();  //비동기, 단일쓰레드에서 성능 좋음 (혼자쓸때)
		sql.append("delete from temp ");
		sql.append(" where empno=? ");
		
		pstmt = conn.prepareStatement(sql.toString());
		pstmt.setInt(1, 112);
		pstmt.executeUpdate(); //delete
		
		
		sql.delete(0, sql.length());  //sql 초기화
		sql.append("insert into temp(empno,ename) values(?,?) ");
		pstmt = conn.prepareStatement(sql.toString()); 
		pstmt.setInt(1,1);
		pstmt.setString(2, "홍길동");
		pstmt.executeUpdate();  //insert
		
		conn.commit(); //수동 커밋 (완료)
		out.print("동작성공!");
		
		
	}catch ( NamingException | SQLException e) {
		System.out.print(e);
		conn.rollback(); //수동 롤백 (취소)
	}finally{
		if(pstmt!=null)try{pstmt.close();} catch(SQLException e){}
		if(conn!=null)try{conn.close();} catch(SQLException e){}
	}
	
	/*  
	트랜직션 : 전체를 동작 하던지, 전체가 동작을 안하던지
	(해당파일에서) 전체 = [삭제, 추가]까지가 한 묶음
	
	
	 */

%>

</body>
</html>