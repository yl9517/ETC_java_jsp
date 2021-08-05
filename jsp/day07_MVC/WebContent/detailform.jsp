<%@page import="kr.or.kosta.dto.BoardDTO"%>
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
	BoardDTO dto =(BoardDTO) request.getAttribute("dto");
%>
	<form method="post" action="modifyresult.do">
		<ul>
			<li>
				<label for="bno">글번호</label>
				<input type="text" name="bno" id="bno" value="<%=dto.getBno() %>" readonly="readonly">
			</li>
			<li>
				<label for="btitle">제목</label>
				<input type="text" name="btitle" id="btitle" value="<%=dto.getBtitle() %>" required="required">
			</li>
			<li>
				<label for="bcontent">내용</label>
				<textarea rows="3" cols="20" name="bcontent" id="bcontent" required="required"><%=dto.getBcontent() %></textarea>
			</li>
			<li>
				작성자 : <%=dto.getBwriter() %>
			</li>
			<li>
				작성일 : <%=dto.getBwritedate() %>
			</li>
			<li>
				조회수 : <%=dto.getBreadno() %>
			</li>			
			<li>
				<input type="submit" value="수정">
				<input type="reset" value="취소">
			</li>
		</ul>
	</form>
</body>
</html>