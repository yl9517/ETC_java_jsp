<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.left, .right{
		float: left;
		margin-right: 30px;
	}
	.bottom{
		clear: both;
	}
</style>
</head>
<body>
	
	<!-- jsp:inlcude  : include 액션   ▶ 각자파일에서 처리 한 후 해당 파일에서 결과만 보여줌  (자주 변경될 경우의 파일은 이 방법이 더 좋음) -->
<div class="top"><jsp:include page="top.jsp"/> </div>
<div class="left"><jsp:include page="left.jsp"/> </div>
<div class="right"><jsp:include page="center.jsp"/>  </div>
<div class="bottom"><jsp:include page="bottom.jsp"/>  </div>
</body>
</html>                                                                                                                                                                                       