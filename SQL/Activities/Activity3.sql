REM   Script: Activity3
REM   FST_B22

CREATE TABLE salesman (  
    salesman_id int,  
    salesman_name varchar2(32),  
    salesman_city varchar2(32),  
    commission int  
);

describe salesman


Select * from salesman;

Select * from salesman;

INSERT INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

insert all  
into salesman values (5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
    select 1 from dual;

Select * from salesman;

Select * from salesman;

select * from salesman;

select * from salesman;

select * from salesman;

select salesman_id, salesman_city from salesman;

select * from salesman where salesman_city="Paris";

select * from salesman where salesman_city='Paris';

select salesman_id, commission from salesman where salesman_name = 'Paul Adam';

