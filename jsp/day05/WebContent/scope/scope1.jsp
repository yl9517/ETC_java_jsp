<%@page import="kr.or.kosta.dto.StudentDTO"%>
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
	StudentDTO dto = new StudentDTO("hong", 20);
	// [1. 내용묶기]
//	pageContext.setAttribute("aaa", dto);  ▶   pageContext는 해당 페이지 내에서만 알 수 있는 묶음!!!
	request.setAttribute("aaa", dto);

%>
<%	// [2. 묶은내용 받기 ]
	// StudentDTO result =(StudentDTO)	pageContext.getAttribute("aaa"); // pageContext으로 묶은 내용 받기
	 StudentDTO result =(StudentDTO) request.getAttribute("aaa"); // request
	
	out.print(result.getName());	//결과 나옴
	out.print(result.getAge()); 
%>
<%
	// [3. 타페이지로 보내기]
	 //response.sendRedirect("scope2.jsp");
											//1. [오류] pageContext - 타 페이지에서 쓸수 없음
   											//2. [오류] request - 해당 페이지에서 처리를 해주지 않기 때문에 scope2.jsp파일은 aaa라는 묶음을 모름
%>
	<jsp:forward page="scope2.jsp"></jsp:forward> 
	<!-- 1. [오류] pageContext - 마찬가지로  pageContext는 타 페이지에서 쓸수 없음
		 2. [실행] request - 해당 페이지에서 처리 해주기 때문에 오류 없이 잘 실행됨!!!!!!!!!!
	  -->
	
	
	
</body>
</html>