show databases;

create database ormlearn;

use ormlearn;

show tables;


create table department (dp_id INT NOT NULL auto_increment primary key , dp_name VARCHAR(45));

create table employee (em_id INTEGER NOT NULL auto_increment, em_name VARCHAR(45), em_salary DOUBLE, em_permanent BOOLEAN, em_date_of_birth DATE, em_dp_id INT, primary key(em_id), foreign key(em_dp_id) references department(dp_id));

create table skill (sk_id INT NOT NULL auto_increment PRIMARY key, sk_name VARCHAR(45));

create table employee_skill(es_id INT NOT NULL auto_increment, es_em_id INT, es_sk_id INT, primary key(es_id), foreign key(es_em_id) references employee(em_id), foreign key(es_sk_id) references skill(sk_id));

select * from employee_skill;

insert into department value (101,'CSE');
insert into employee value(1, 'Sourav', 25875.00, true, '1998-01-27', 101 );
insert into skill value (201,'Coding');
insert into employee_skill values (301, 1,201);
