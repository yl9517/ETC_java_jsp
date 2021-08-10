<%@page import="kr.or.kosta.dto.BoardDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>번호</th><th>글제목</th><th>작성자</th><th>작성일</th><th>조회수</th>
			</tr>
		</thead>
		<tbody>

<%
	List<BoardDTO> pagelist = (List<BoardDTO>)request.getAttribute("pagelist");
	int currpage = (Integer) request.getAttribute("currpage");
	int totalpage = (Integer) request.getAttribute("totalpage");
	int startblock = (Integer) request.getAttribute("startblock");
	int endblock = (Integer) request.getAttribute("endblock");
	
	if(pagelist.size()==0){%>
		<tr>
			<td colspan="5">해당 자료가 없습니다.</td>
		</tr>
<%	}else{
		for(BoardDTO dto:pagelist){ %>
			<tr>
				<td><%=dto.getBno() %></td>
				<td><%=dto.getBtitle() %></td>
				<td><%=dto.getBwriter() %></td>
				<td><%=dto.getBwritedate() %></td>
				<td><%=dto.getBreadno()%></td>
			</tr>	
	<%	}
	}	
%>
		</tbody>
	</table>
<%
	if(startblock>1){ %>	
		<a href="list.kosta?curr=<%=currpage-1 %>">이전</a>
<%} 
    for(int i=startblock; i<=endblock; i++){
		if(currpage==i){%>
			<%=i %>	
<%		}else{%>
		<a href="list.kosta?curr=<%=i %>"><%=i %></a>
<%		}
	}	
    if(currpage<totalpage){    %>
		<a href="list.kosta?curr=<%=currpage+1 %>">다음</a>
<%} %>	
	
<%-- <%
	if(currpage>1){ %>	
		<a href="list.kosta?curr=<%=currpage-1 %>">이전</a>
<%} %>
		<%=currpage %>
<%	if(currpage<totalpage){    %>
		<a href="list.kosta?curr=<%=currpage+1 %>">다음</a>
<%} %> --%>
</body>
</html>