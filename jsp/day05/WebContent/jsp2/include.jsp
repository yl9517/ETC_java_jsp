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
<!-- page 디렉티브, include 디렉티브  ▶ 아래 파일들을 모두 이 파일에 복붙하는 느낌(파일 하나밖에 안보임, 자주 변경되지 않는 파일은 이 방법이 더 좋음)  -->
<div class="head"><%@ include file="top.jsp"%></div>
<div class="left"><%@ include file="left.jsp"%></div>
<div class="right"><%@ include file="center.jsp"%> </div>
<div class="bottom"><%@ include file="bottom.jsp"%> </div>
</body>
</html>