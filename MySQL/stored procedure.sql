use classicmodel;

create table customers(id int primary key,firstname varchar(255), lastname varchar(255));

insert into customers (id,firstname,lastname) values(1,"Shubham","Tingare"),(2,"Abhijeet","Pawar"),(3,"Advait","Deshpande"),(4,"Akshay","Dhole");

select * from customers;

select firstname,lastname from customers order by firstname desc, lastname asc;

select firstname,lastname from customers order by lastname;

insert into customers(id,firstname,lastname) values(5,"Prathamesh","Sawant"),(6,"Ankit","Gorane"),(7,"Santosh","Babar");

alter table customers add column jobtitle varchar(255);

DELIMITER $$
CREATE PROCEDURE GetCustomers()
BEGIN
SELECT firstname,lastname FROM customers ORDER BY lastname;
END $$ 
DELIMITER ;

DELIMITER $$
CREATE PROCEDURE GetCustomersInfo(IN id int)
BEGIN
SELECT firstname,lastname FROM customers ORDER BY lastname;
END $$ 
DELIMITER ;

CALL GetCustomersInfo(1);

DELIMITER $$
CREATE PROCEDURE GetCustomerInfo(IN id int, OUT firstname varchar(255))
BEGIN
SELECT firstname,lastname FROM customers ORDER BY lastname;
END $$ 
DELIMITER ;

CALL GetCustomerInfo(5,"Abhijeet");