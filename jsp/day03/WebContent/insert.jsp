<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	ul li{
		list-style:none;
		padding:10px 0px;
	}
	ul li label{
		display : inline-block;
		width : 100px;
	}
</style>
</head>
<body>
	<form method="post" action="insertresult.jsp">
		<ul>
			<li>
				<label for="ename">사원이름</label>
				<input type="text" name="ename" id="ename" required="required"> <br>					
			</li>
			<li>
				<label for="sal">급여</label>
				<input type="text" name="sal" id="sal"> <br>					
			</li>
			<li>
				<label for="hiredate">입사일</label>
				<input type="date" name="hiredate" id="hiredate" max="2021-07-29"> <br>					
			</li>
			<li>
				<input type="submit" value="전송">
				<input type="reset" value="취소">				
			</li>
		</ul>
	</form>
</body>
</html>