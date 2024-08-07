create database employee;

create table employeeInfo(emp_id int primary key, emp_name varchar(255) not null, emp_salary int not null);

insert into employeeInfo(emp_id,emp_name,emp_salary) values(101,"abc",40000); 

select * from employeeInfo;

insert into employeeInfo(emp_id,emp_name,emp_salary) values(102,"bcd",25000),(103,"cde",35000);

update employeeInfo set emp_name="pqr" where emp_id=103;

alter table employeeInfo add emp_branch varchar(255);

update employeeInfo set emp_branch="Account" where emp_id=101;

alter table employeeInfo add emp_age int;

alter table employeeInfo drop emp_age;

alter table employeeInfo modify column emp_branch varchar(150);

create table test(id int, name varchar(200));

insert into test(id,name) values(1,"abc");

select * from test;

delete from test where id=1;
set sql_safe_updates=0;

drop table test;

create table test(id int primary key auto_increment, name varchar(255) not null);

insert into test(name) values("shubham");

select * from test;

insert into test(name) values("abhijeet");

alter table test add age int check (age > 18);

update test set age=20 where id=1;

update test set age=17 where id=1;

select * from test;
