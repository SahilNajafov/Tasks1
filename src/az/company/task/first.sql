-- SET lc_messages TO 'en_US.UTF-8'

-- create table myschema.qrup(
-- 	qrup_id int primary key not null,
-- 	name varchar(20) unique not null
-- )

-- create table myschema.teacher(
-- 	teacher_id int primary key not null,
-- 	name varchar(20) not null,
-- 	surname varchar(20) not null,
-- 	contact_mail text unique not null,
-- 	qrup_id int,
-- 	foreign key(qrup_id) references myschema.qrup(qrup_id)
-- )

-- create table myschema.student(
-- 	student_id int primary key not null,
-- 	name varchar(20) not null,
-- 	surname varchar(20) not null,
-- 	contact_mail text unique not null,
-- 	qrup_id int,
-- 	foreign key(qrup_id) references myschema.qrup(qrup_id)
-- )

-- select * from myschema.student

-- insert into myschema.student
-- values(1,'reshad','resadov','resad@gmail.com',1),
-- (2,'kenan','kenanov','kenan@gmail.com',1),
-- (3,'chingiz','chingizov','chingiz@gmail.com',1),
-- (4,'sahil','sahilov','sahil@gmail.com',1),
-- (5,'senan','senanov','senan@gmail.com',2),
-- (6,'kamil','kamilov','kamil@gmail.com',2),
-- (7,'ismayil','ismayilov','ismayil@gmail.com',3),
-- (8,'sadiq','sadiqov','sadiq@gmail.com',3),
-- (9,'yusif','yusifov','yusif@gmail.com',4),
-- (10,'nizami','nizamov','nizami@gmail.com',5),
-- (11,'ferhad','ferhadov','ferhad@gmail.com',5)

-- select * from myschema.student

-- her qrupda nece telebe var:

-- select qrup.name qrup_name,count(*) student_count from myschema.qrup
-- inner join myschema.student on student.qrup_id=qrup.qrup_id group by qrup.name order by count(*)

-- her qrupda hansi telebeler var:

-- select qrup.name qrup_name,student.name student_name from myschema.qrup
-- inner join myschema.student on student.qrup_id=qrup.qrup_id group by qrup.name,student.name order by qrup_name desc

--her muellimin hansi telebeleri var:

-- select teacher.name teacher_name,student.name student_name from myschema.teacher
-- inner join myschema.student on student.qrup_id=teacher.qrup_id group by teacher.name,student.name order by teacher_name desc

--her muellimin nece telebesi var:

-- select teacher.name teacher_name,count(*) student_count from myschema.teacher
-- inner join myschema.student on student.qrup_id=teacher.qrup_id group by teacher.name order by count(*)






