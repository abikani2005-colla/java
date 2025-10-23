drop database ece;
create database ece;
use ece;
create table employee(
empid int primary key,
ename varchar(20),
job_desc varchar(20),
salary int
);
insert into employee(empid,ename,job_desc,salary)
value (1,'abi','ceo',1000000),
(2,'jagan','manager',10000),
(3,'lpa jana','ceo',20000),
(4,'hemath','coe',103000),
(5,'lazy aravind','analyst',210000),
(6,'shanmuga','testing',120000),
(7,'prabha','developer',103000),
(8,'kamal','designer',10000),
(9,'aadhi','head',10000);
select*from employee
where ename<>'lpa jana';
select*from employee
where salary>20000;
select*from employee
where salary<20000 and job_desc='manager';
select*from employee
where job_desc  not in('manager','ceo');
select*from employee
limit 5;
update employee
set job_desc='hero'
where empid=1;
select*from employee;



