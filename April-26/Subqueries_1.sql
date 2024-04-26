
-- Display Max sal from emp table 

select max(sal) from Emp;

-- Display name of employee who is getting max. salary

select ename from emp where sal = max(sal);

-- the above query raises an error as aggregate functions cannot be done in where clause, the above query we can write as

select ename from emp where sal = (select max(sal) from emp);

-- Display the second max. salary 

select max(sal) from Emp where sal < (select max(sal) from Emp);

-- Display name of employee who is getting second max. salary 

select ename from emp where sal = (
select max(sal) from Emp where sal < (select max(sal) from Emp));