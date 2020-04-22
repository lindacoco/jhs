create database jhs_project;

select user(),database();
use jhs_project;
create table project (
  no int auto_increment,
  name varchar(20) not null,
  content text not null,
  regDate timestamp not null default now(),
  endDate timestamp null,
  progress varchar(10) null,
  primary key(no)
);

desc project ;
drop table project;
select * from project;

insert into project(name,content,regDate,endDate,progress)(select name, content, regDate, endDate,progress from project);