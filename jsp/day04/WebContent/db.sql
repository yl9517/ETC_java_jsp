/* 글번호, 제목,내용, 작성자,작성일, 조회수*/
create table board(
	bno int
	, btitle varchar2(20) not null
	, bcontent varchar2(1000)
	, bwriter varchar2(20)
	, bwritedate date
	, breadno int
	, constraint board_bno_pk primary key(bno)
	
);

create sequence boardseq;

insert into board values(boardseq.nextval, 'title1','content1','홍길동',sysdate,0);
insert into board values(boardseq.nextval, 'title2','content2','김하나','2020-01-01',0);
insert into board values(boardseq.nextval, 'title3','content4','한자바','2021-07-01',0);

commit