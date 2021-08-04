<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	*{
		margin: 0;
		padding:0;
		box-sizing:border-box;
	}
	#wrap{
		width: 300px;
		margin: 30px auto;
	}
	input{
		padding: 5px 10px;
		margin-bottom: 10px;
	}
</style>
</head>
<body>

	<div id="wrap">
		<form method="post" action="insertAction.jsp">
			<label for="id">이름</label>
			<input type="text" id="name" name="name"> <br>
			<label for="hire">입사일</label>
			<input type="date" id="hire" name="hire" max="2021-08-03"> <br>
			<label for="sal">연봉</label>
			<input type="text" id="sal" name="sal"> <br>
			<label for="id">부서코드</label>
			<input type="number" id="dept" name="dept"> <br><br>	
			
			<input type="submit" value="추가">		
			<input type="reset" value="취소">		
		</form>
	</div>
</body>
</html>