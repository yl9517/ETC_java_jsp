<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="insertresult.do">
		<ul>
			<li>
				<label for="btitle">제목</label>
				<input type="text" name="btitle" id="btitle" required="required">
			</li>
			<li>
				<label for="bcontent">내용</label>
				<textarea rows="3" cols="20" name="bcontent" id="bcontent" required="required"></textarea>
			</li>
			<li>
				<label for="bwriter">작성자</label>
				<input type="text" name="bwriter" id="bwriter">
			</li>
			<li>
				<input type="submit" value="글쓰기">
				<input type="reset" value="취소">
			</li>
		</ul>
	</form>
</body>
</html>