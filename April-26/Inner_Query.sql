select Empno,Ename,job,sal,
case when comm is null then 0 else comm end comm,
case when comm is null then sal else sal+comm end takeHome
from Emp E;

-- From above query print all records whose takehome is > 2000;
select Ed.Empno,Ed.Ename, Ed.Job, Ed.Sal, Ed.TakeHome
from
(select Empno,Ename,job,sal,
case when comm is null then 0 else comm end comm,
case when comm is null then sal else sal+comm end takeHome
from Emp E) ED 
WHERE Ed.TakeHome > 2000;