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
	Cookie[] clist = request.getCookies(); //쿠키추출 => 쿠키배열로 돌려줌

	for(int i=0; i<clist.length; i++){
		// System.out.print(clist[i].getName());
		if(clist[i].getName().equals("id")){
			out.print("cookie 정보는 다음과 같습니다 <br>");
			out.print(clist[i].getName()+"<br>");
			out.print(clist[i].getValue()+"<br>");
		}
	}
%>
</body>
</html>