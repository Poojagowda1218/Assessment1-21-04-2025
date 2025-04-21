--1--
create table students(
id serial primary key,
name varchar(20) not null,
email varchar(40) unique,
age int,
marks float
)
insert into students values(1,'pooja','pooja@gmail.com',22,40.5);
insert into students values(6,'spandu','spandu@gmail.com',23,50.5);
insert into students values(2,'raju','raju@gmail.com',22,30.5);
insert into students values(3,'ravi','ravi@gmail.com',21,40.5);
insert into students values(4,'rakesh','rakesh@gmail.com',20,60.5);
insert into students values(5,'ramesh','ramesh@gmail.com',20,60.5);
insert into students values(7,'rani','rani@gmail.com',17,60.5);

select * from students;
--2--
select * from students where age>21

--3--
update  students set email='rahul@gmail.com' where id=5

--4--
delete from students where age<18

--5--
select  * from students limit 1 offset 1

--6--

create table students1(
id int primary key,
name varchar(20),
age int
)
insert into students1 values(1,'rahul',22);
insert into students1 values(2,'priya',21);
insert into students1 values(3,'akash',23);

select * from students1

create table courses(
course_id int primary key,
student_id int,
course_name varchar(40)
)
insert into courses values(101,1,'java');
insert into courses values(102,2,'python');
insert into courses values(103,1,'sql');

select * from courses

select s.name, c.course_name from students1 s inner join courses c on s.id=c.student_id
