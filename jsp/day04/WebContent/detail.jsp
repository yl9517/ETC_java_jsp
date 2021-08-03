<%@page import="com.kosta.dto.BoardDTO"%>
<%@page import="com.kosta.dao.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title><script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<style>
*{
	padding:0;
	margin:0;
}
	
	div#wrap{
		width : 800px;
		min-height : 300px;
		border : 5px solid silver;
		margin: 30px auto 0px;
		padding: 20px;
	}
	h2{
		text-align: center;
	}
	.line{
		width: 800px;
		border: 1px solid silver;
		margin : 10px 0;
	}
	.info{
		text-align: right;
	}
	span{
		font-size: 12px;
		margin-left: 20px;
	}
	#btns{
		width : 840px;
		margin: 10px auto;
	}
	#btns input{	
		padding: 10px 20px;
		margin-right: 20px;
		font-size: 16px;
	}
	#btns input#listbtn{
		float:right;
		margin: 0;
	}
</style>
</head>
<body>
<% 
	 request.setCharacterEncoding("utf-8");
	
	int bno = Integer.parseInt(request.getParameter("bno"));

	BoardDAO dao = new BoardDAO();	
	dao.upRead(bno);
	BoardDTO dto = dao.getone(bno);
	
%>
	<div id="wrap">
		<h2><%=dto.getBtitle() %></h2>
											<div class="line"></div>
		<div class="info">
			<p>작성자 : <%=dto.getBwriter() %></p>
			<span>작성일 : <%=dto.getBwritedate() %></span>
			<span>조회수 : <%=dto.getBreadno() %></span> 
		</div>
											<div class="line"></div>
		<p><%=dto.getBcontent() %></p>
	</div>
	<div id="btns">
		<input type="button" value="수정" onclick="modify(<%=bno%>)"> 
		<input type="button" value="삭제" onclick="del(<%=bno%>)"> 
		<input type="button" id="listbtn" value="목록보기">
	</div>
	
<script src="js/board.js"></script>
</body>
</html>