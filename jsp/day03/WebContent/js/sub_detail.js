//JS
function modify(empid){
	location.href="modify.jsp?id="+empid; //페이지 이동		
}

//jQuery
$(document).ready(function(){
	
	$('#del').click(function(){ //수정버튼 눌렀을때
		let empid = $('ul li').eq(0).text().substring(8).trim();  //id 가져오기
		location.href="del.jsp?id="+empid; 
	});
	
});

