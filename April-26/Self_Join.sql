
select * from Emp;

select empno, ename,mgr from emp;

-- Self join with inner join

select E1.Empno 'Manager Id', E1.Ename 'Manager Name',
E2.Empno 'Employ Id', E2.Ename 'Employ Name'
from Emp E1 INNER JOIN EMP E2 ON 
E1.Empno = E2.Mgr
order by E2.Empno;

-- self join with right outer join

select E1.Empno 'Manager Id', E1.Ename 'Manager Name',
E2.Empno 'Employ Id', E2.Ename 'Employ Name'
from Emp E1 RIGHT JOIN EMP E2 ON 
E1.Empno = E2.Mgr
order by E2.Empno;

