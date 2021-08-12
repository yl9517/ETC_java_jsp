<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

<!-- 부가적인 테마 -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">

<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>

	<script>
		$(document).ready(function() {
			let no = ${dto.boardno};
//			console.log(no)
			$.ajax({
				url : 'subdetail.do'
				, data : {'num':no}
				, method : 'post'
				, dataType : 'json'
				,success : function(data) {
					console.log(data);
					
				}
				,error : function(xhr) {
					console.log('error'+xhr);
				}
			});
		});
	</script>

</head>
<body>
	<c:set var="item" value="${requestScope.dto }"></c:set>
	
	<table class="table table-hover" id="aa">
		<tr> <td>번호</td> <td><c:out value="${dto.boardno}"></c:out></td> </tr>
		<tr> <td>제목</td> <td><c:out value="${dto.boardtitle}"></c:out></td> </tr>
		<tr> <td>내용</td> <td><c:out value="${dto.boardcontent}"></c:out></td> </tr>
	</table>
	
	<form method="post" action="subadd.do">
		<input type="hidden" name="num" value="${dto.boardno }">
		<textarea rows="3" cols="20" name="content"></textarea> <br>
		<input type="text" name="writer"><br>
		<input type="button" id="send" value="댓글등록">
	</form>
	
	<table id="result">
	
	</table>
</body>
</html>