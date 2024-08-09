use classicmodels;

create table employees_audit(id int auto_increment primary key, employeeNumber int not null, lastname varchar(50) not null, changeDat datetime default null, action varchar(50) default null);

create trigger before_employee_update before update on employees for each row insert into employees_audit set action = "update", employeeNumber=old.employeeNumber, lastname = old.lastname, changedat=Now();

update employees set lastname="Roy" where employeeNumber=1056;

select * from employees_audit;

select * from employees where employeeNumber=1056;


delimiter $$

create function customerLevel(credit decimal(10,2))
returns varchar(20)
deterministic
begin declare customerLevel varchar(20);
if credit > 50000 then set customerLevel="Platinum";
elseif (credit >= 50000 and credit <=10000) then set customerLevel="Gold";
elseif credit < 10000 then set customerLevel="Gold";
end if;
return (customerLevel);
end $$
delimiter ;

select customerName, customerLevel(creditLimit) from customers order by customerName;