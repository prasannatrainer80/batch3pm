-- Display nth max salary 

select sal from Emp;

select max(sal) from emp E1 where 3-1 = (select count(distinct sal) from Emp E2 where 
	e2.sal > e1.sal);