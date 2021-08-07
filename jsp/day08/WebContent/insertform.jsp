<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/emp.css">
</head>
<body>

	<form method="post" action="insertresult.kosta">
		<ul>
			<li>
				<label for="ename">사원명</label>
				<input type="text" id="ename" name="ename" required="required">
			</li>
			<li>
				<label for="job">직책</label>
				<input type="text" id="job" name="job" required="required">
			</li>
			<li>
				<label for="sal">급여</label>
				<input type="text" id="sal" name="sal">
			</li>
			<li>
				<input type="submit" value="등록">
				<input type="reset" value="취소">
			</li>

		</ul>
	</form>
</body>
</html>