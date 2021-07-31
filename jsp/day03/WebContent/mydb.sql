show databases;

use kostadb;

show tables;

-- varchar, char, int, long, float

-- 제약조건 : primary key, not null, unique, check, foreign key  ........(default)


create table lsum(
	empno int primary key auto_increment
	, ename varchar(20) not null
	, job varchar(20) check(job in('a','b','c'))
	, deptno int
);

create table lsum_dept(
	deptno int auto_increment primary key
	, deptname varchar(20)
);

commit;

insert into lsum_dept(deptname) values('bbb');
insert into lsum_dept(deptname) values('aaa');

select * from lsum_dept;