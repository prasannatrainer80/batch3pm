select empno,ename,job,sal from Emp;

-- If Job is CLERK put Head as 'Huda Shaik'
-- if job is SALESMAN put HEAD as 'Satyam'
-- if Job is ANALYST put Head as 'Madhusree'
-- if job is MANAGER put head as 'Balaji'
-- if job is PRESIDENT put as 'No Manager' 

select empno, ename,job,sal,
case job
  WHEN 'CLERK' THEN 'Huda Shaik'
  WHEN 'SALESMAN' THEN 'Satyam'
  WHEN 'ANALYST' THEN 'Madhusree'
  WHEN 'MANAGER' THEN 'Balaji'
  ELSE 'No Manager'
end 'Head'
from Emp;

select * from Dept;

-- if Dname is 'ACCOUNTING' THEN 'PUNE' 
-- if Dname is 'RESEARCH' THEN 'HYDERABAD'
-- if Dname is 'SALES' THEN 'CHENNAI'
-- if Dname is 'OPERATIONS' then 'DELHI' 

select deptno, dname,
case dname
  WHEN 'ACCOUNTING' THEN 'PUNE'
  WHEN 'RESEARCH' THEN 'HYDERABAD'
  WHEN 'SALES' THEN 'CHENNAI'
  WHEN 'OPERATIONS' THEN 'DELHI'
end 'head office'
from Dept;

SELECT EMPNO,ENAME,JOB,SAL,COMM FROM EMP;

-- Write a query as replace null value with 0 value (use case ) 

select Empno, Ename, Job, Sal,
CASE WHEN COMM IS NULL THEN 0 else COMM end 'comm'
from Emp;

-- Dispaly values as if comm is null then sal else sal+comm as 'TakeHome'

select Empno, Ename, Job, Sal,
CASE WHEN COMM IS NULL THEN 0 else COMM end 'comm',
CASE WHEN COMM IS NULL THEN SAL ELSE SAL + COMM END 'Take Home'
from Emp;

