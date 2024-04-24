-- Display list of databases in current instance

show databases;

-- Change to hexapractice database 

use hexapractice;

-- Display List of tables avaialble in the current database 

show tables;

-- Display all records from EMp table 

select * from Emp;

-- Display Empno, Ename, job, sal from Emp table  (this is called PROJECTION operator) 

select empno, ename,job,sal
from Emp;

-- Display all records whose sal > 2000 (RESTRICT Operator) 

select * from Emp where sal > 2000;

-- Display all records whose job is Manager 

select * from Emp where job='Manager';

-- Display info whose ename is 'FORD'

select * from Emp where ename='FORD';

-- Between...AND : Displays records from Start to end range It works with only numbers and datetime only

-- Display records whose sal from 1000 to 3000 

select * from Emp where sal between 1000 and 3000;

select * from emp where sal not between 1000 and 3000;

-- IN Clause : used to check for multiple values of specified column values

-- Display all records whose job is CLERK or SALESMAN or ANALYST 

select * from Emp where job in('CLERK','SALESMAN','ANALYST'); 

-- Display information whose Ename is SMITH or WARD or KING or MILLER or FORD

select * from Emp where ENAME IN('SMITH','FORD','KING','MILLER','WARD'); 

select * from Emp WHERE ENAME NOT IN('SMITH','WARD','MILLER','FORD');

-- How to check for NULL constraint 

-- Display all records for whom comm is NULL 

select * from Emp where comm is null;

-- Dispaly all records whose comm is NOT NULL

select * from Emp where comm is not null;

-- LIKE Operator : Used to display records w.r.t. Wildcards 

-- Display all records whose name starts with 'S' 

select * from Emp where ename like 'S%';

-- Display all records whose Name ends with 'S' 

select * from Emp where ename like '%S';

-- Dispaly all records whose names starts with 'J' and 5th char is 'S'

select * from Emp where ename like 'J___S'; 

-- Order By : Allows you to display data on specific field(s) in ascending or descending order 

select * from Emp
order by job;

select * from Emp
order by sal desc;

-- To display the structure of the table 

DESC EMP;

select * from Emp order by job, ename;

select * from Emp order by job, ename desc;