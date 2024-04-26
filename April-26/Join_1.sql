select Dept.Deptno, Dname, Empno, Ename, Job, Sal
from Dept INNER JOIN EMP
ON Dept.Deptno = Emp.Deptno;

-- Aliasing : The above query w.r.t. Aliasing we need to make then 

select D.Deptno, Dname, Empno, Ename, JOb, sal
from Dept D INNER JOIN EMP E 
ON D.DeptNo = E.DeptNo;


select D.Deptno, Dname, Empno, Ename, JOb, sal
from Dept D LEFT JOIN EMP E 
ON D.DeptNo = E.DeptNo;