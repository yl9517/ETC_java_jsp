//메인-글쓰기
$(document).ready(function(){
	$('#btnwrite').click(function(){
		location.href="insert.jsp";
	});
})

//글-수정
function modify(bno){
	location.href="modify.jsp?bno="+bno;
}
//글-삭제
function del(bno){
	location.href="delete.jsp?bno="+bno;
}

//글-목록보기
$('#listbtn').click(function(){
	location.href="list.jsp";
});