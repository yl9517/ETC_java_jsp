<%@page import="kr.or.kosta.dto.EmpDTO"%>
<%@page import="java.util.List"%>
<%@page import="kr.or.kosta.dao.EmpDAO"%>
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
	//현재 페이지 번호
	String curr = request.getParameter("curr");
	int currpage =1; //초기값
	
	if(curr!=null) 
		currpage=Integer.parseInt(curr);
	

	EmpDAO dao = new EmpDAO();
	int totalCount = dao.totalCount();
//System.out.println(totalCount);  107
	
	int pageSize=10;  //페이지당 몇개 보여줄 건지
	int pageCount = (int)Math.ceil((float)totalCount/pageSize); //총 페이지 수   //ceil : 올림 (페이징당 10개, 1개라도 더 있으면 페이지+1 해야하므로) 
	//System.out.print(pageCount);  11
	
	
	
//	int startrow = (currpage-1)*pageSize+1; //페이지의 첫글번호
//	int endrow = startrow+pageSize-1; //페이지 마지막번호
	int endrow = currpage*pageSize;
	int startrow = endrow-pageSize+1;
			
	if(endrow>totalCount) //마지막 번호가 총 글수보다 크다면? 글수는 107개인데 마지막번호는 110이라면
		endrow=totalCount; //마지막번호는 총 글수로

	int pageblock=5; //5페이지 단락으로 하단에 나오도록
		
	List<EmpDTO> list = dao.getList(startrow,endrow);
%>
	<table>
		<thead>
			<tr>
				<th>사원번호</th>
				<th>이름</th>
				<th>급여</th>
				<th>부서코드</th>
			</tr>
		</thead>
		<tbody>
<%
		if(list.size()==0){
%>
			<tr>
				<th colspan="5">자료가 없습니다.
			</tr>
<%}		else{  //자료가 있으면
			for(EmpDTO item:list){%>
				<tr>
					<td><%=item.getEmployee_id() %></td>
					<td><%=item.getFirst_name() %></td>
					<td><%=item.getSalary() %></td>
					<td><%=item.getDepartment_id() %></td>
				</tr>
<%      }	
}
%>
		</tbody>	
	</table>
<%
	int startpage= pageblock*((currpage-1)/pageblock)+1;
	int endpage = startpage+pageblock-1;
	
	if(endpage>pageCount){ //마지막 페이지가 전체페이지수보다 크면  
		endpage = pageCount; 
	}
	
	if(startpage>1){ %>
		<a href="emplist.jsp?curr=<%=currpage-1 %>">이전</a>
<%	}
	for(int i=startpage; i<=endpage; i++){ 
		if(currpage==i){	//현재페이지라면  %>
			<%=i %>
<%		}
		else{ %>
		<a href="emplist.jsp?curr=<%=i %>"><%=i %></a>	
<% 		}
	}
	if(endpage<pageCount){ %>
		<a href="emplist.jsp?curr=<%=currpage+1 %>">다음</a>
<%  }
%>	
	
	
	
<%
//		if(currpage>=2){  //2페이지 이상이면 이전버튼 나오기%>
	<!-- 	<a href="emplist.jsp?curr=< %=currpage-1%>">이전</a>  -->
<%//		} %>
	<!-- 	< %=currpage %> -->
<%//		if(currpage<pageCount){  //현재페이지가 pageCount보다 작으면 다음버튼 나오기 (마지막페이지면 다음버튼X)%>
		<!-- 	<a href="emplist.jsp?curr=< %=currpage+1%>">다음</a> -->
<%//}
		
%>



</body>
</html>