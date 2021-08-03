<%@page import="java.util.List"%>
<%@page import="com.kosta.dto.EmpDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.kosta.dao.EmpDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<style>
	*{
		margin: 0;
		padding:0;
		box-sizing:border-box;
	}
	#wrap{
		width: 600px;
		margin: 30px auto;
		text-align: center;
	}
	input{
		padding: 7px 15px;
		margin-bottom:10px;
	}
	
	table{
		border-collapse: collapse;
		margin-bottom:20px;
	}
	th{
		background-color : yellow;
	}
	th,td{
		border : 1px solid silver;
		min-width : 120px;
		text-align: center;
		padding: 5px 10px;
	}
	td:nth-child(4) {
		text-align: right;
	}
	a{
		text-decoration: none;
		color: black;
	}
	
	form input, select{
		padding: 3px 10px;
		margin-bottom:20px;	
	}
</style>
</head>
<body>
<%

	EmpDAO dao = EmpDAO.getDAO();

	//페이징
	int nowPage = 1; //현재 페이지 수
	String now = request.getParameter("now");
	if(now!=null){
		nowPage = Integer.parseInt(now);
	}
	
	int pageSize = 10;	//페이지당 보여줄 갯수
	int dataCount = dao.getCount(); //전체 자료 갯수
	int pageCount = (int)Math.ceil((float)dataCount/pageSize); //페이지 갯수
	
	int lastNo = nowPage*pageSize; //마지막번호
	int firstNo = lastNo-pageSize+1; //첫번호

	
	
	int pageblock = 5; //페이지 단락
	int startblock = pageblock*((nowPage-1)/pageblock)+1;
	int endblock = startblock+pageblock-1;
	
	if(endblock>pageCount){
		endblock=pageCount;
	}
	

	//검색
	String topic = request.getParameter("topic");
	String keyword = request.getParameter("keyword");
	
	if(topic==null){
		topic="";
	}
	if(keyword == null){
		keyword="";
	}

%>
	<div id="wrap">
		<input type="button" id="addbtn" value="직원추가"> <br>
		
		<form method="post" action="list.jsp">
			<select name="topic">
				<option value="employee_id">사원번호</option>
				<option value="first_name">이름</option>
				<option value="department_id">부서코드</option>
			</select>
			<input type="text" name="keyword">
			<input type="submit" value="검색">
		</form>
	
<%
	List<EmpDTO> list = dao.getList(firstNo, lastNo, topic, keyword);
%>	
		<table>
			<thead>
				<tr>
					<th>사원번호</th>
					<th>이름</th>
					<th>입사일</th>
					<th>연봉</th>
					<th>부서코드</th>
				</tr>
			</thead>
			<tbody>
<%      if(list.size()==0){%>
				<tr> 
					<td colspan="5">자료가 없습니다</td>
				</tr>
<%   	}else{
			for(EmpDTO dto:list){               %>	
				<tr>		
					<td><%=dto.getEmployee_id() %></td>
					<td><a href="detail.jsp?id=<%=dto.getEmployee_id() %>">	<%=dto.getFirst_name() %></a></td>
					<td><%=dto.getHire_date().substring(0,10) %></td>
					<td><%=dto.getSalary() %></td>
					<td><%=dto.getDepartment_id() %></td>
				</tr>
<%
			}
		}
%>					
			</tbody>
		</table>
<% 	if(startblock!= 1){ %>
		<a href="list.jsp?now=<%=nowPage-5 %>">이전</a>
<%  } 
	for(int i=startblock; i<=endblock; i++){
		if(i==nowPage){   %>
			<%=i %>
	<%}else{ %>
		<a href="list.jsp?now=<%=i %>"><%=i %></a>
<%	}
}
	if(pageCount!= nowPage){ %>
		<a href="list.jsp?now=<%=nowPage+5 %>">다음</a>
<%  } %>
		
		
		
		
	</div>
	<script src="js/btnAction.js"></script>
</body>
</html>