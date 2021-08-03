<%@page import="java.util.List"%>
<%@page import="com.kosta.dto.BoardDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.kosta.dao.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script src="js/board.js"></script>
</head>
<body>

<%		//검색창
	request.setCharacterEncoding("utf-8");
	String search = request.getParameter("search");
	String searchtxt = request.getParameter("searchtxt");
	
	if(search==null)
		search="";
	if(searchtxt==null)
		searchtxt="";

%>
<%
	BoardDAO dao = new BoardDAO();

	List<BoardDTO> list =  dao.getList(search, searchtxt);
	
	%>

	<table>
		<thead>
			<tr>		
				<th>글번호</th>
				<th>글제목</th>
				<th>작성자</th>
				<th>작성일</th>
				<th>조회수</th>
			</tr>
		</thead>
		<tbody>
<% 	 if(list.size()==0){%>
		<tr>
			<td colspan="5">내용이 없습니다</td>
		</tr>
<%   } else{
	   	 for(BoardDTO dto:list){%>
			<tr>
				<td><%=dto.getBno() %></td>
				<td><a href="detail.jsp?bno=<%=dto.getBno()%>"><%=dto.getBtitle() %></a></td>
				<td><%=dto.getBwriter() %></td>
				<td><%=dto.getBwritedate() %></td>
				<td><%=dto.getBreadno() %></td>
			</tr>	
<%		}
      }
	%>
		</tbody>
	</table>
	
	<form method="post" action="list.jsp">
		<select name="search">
			<option value="btitle">제목</option>
			<option value="bcontent">내용</option>
			<option value="bwriter">작성자</option>
		</select>
		<input type="text" name="searchtxt">
		<input type="submit" value="검색"> <br>
	</form>
	
	<input type="button" id="btnwrite" value="글쓰기"> 
</body>
</html>
