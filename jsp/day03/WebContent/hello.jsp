<%@ page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 
	jsp : javaserver page ▶ html css js와 같이 사용하는 page
	
	jsp  =>	  java	=> class
		파싱		     컴파일
		
	hello.jsp => hello_jsp.java	
	
 -->
<%	//스크립 트릿 : 자바소스
	
	String name="hong gil dong";
	int age = 10;
	
	ArrayList<String> arr = new ArrayList<>();
	arr.add("hong");
	arr.add("kim");
	arr.add("park");
	arr.add("hello");
/*
	out.print("name :"+name+"<br>");
	out.print("age :"+age+"<br>");

	out.print("목록보기<br>");
	for(String item:arr){
		out.print(item+"<br>");
	}
*/
%>

	 이름 <%=name %><br>  <!-- 표현식 -->
	 나이 <%=age %><br>
	 목록<br>
	 
	 <%
	 	for(String index:arr){
	 %>
	 	<%=index %><br>
	 <%} %>
	 
	 
	 
	 <%=test %> <!-- 선언문(전역변수)에서 선언하였으므로 에러안남 -->
	 <%!   //선언문  => servlet : 새 메소드 생성해서 저장
	 	void prt(){
		 System.out.print("hello");
	 	}
	 	
	 	String test ="주소지";  //인스턴스변수
	 %>
	 
  <!-- < %= //test2 % > 선언 전에 호출하였으므로  에러남  : service는 지역변수 -->
	<%
		String test2 = "취미";
		prt();
	%>

</body>
</html>