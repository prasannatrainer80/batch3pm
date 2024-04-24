-- Aggregate Functions 

-- Sum() : Used to perform sum operation on the given numberic field

select sum(sal) from EMp;

-- avg() : Used to perform avg. operation on the given numberic field

select avg(sal) from Emp;

-- max() : Used to display max. value 

select max(sal) from Emp;

-- min() : used to display min. value 

select min(sal) from Emp; 

-- count(*) : Display total no.of records of the given table

select count(*) from Emp; 

-- count(column_name) : Displays total no.of records for this column_name is not null

select count(comm) from Emp; 

select count(mgr) from Emp;