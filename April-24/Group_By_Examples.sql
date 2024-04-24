-- Group By : Used to display summary reports on the table column specified 

select * from Emp;

-- Display Job wise how many employees are working, that count to be printed 

select job, count(*) from Emp 
group by job;

-- Display job wise total salary paying to each job, that sum to be printed 
select job, sum(sal) from Emp
group by job;

-- Display avg(sal) and max(sal), min(sal) for each job

select job, avg(sal) 'Average Sal', 
			max(sal) 'Max Sal', 
            min(sal) 'Min Sal' from Emp
group by job;

select job, Count(*) 'Total Employs', sum(sal) 'Total Salary',
		avg(sal) 'Average Sal', 
			max(sal) 'Max Sal', 
            min(sal) 'Min Sal' from Emp
group by job;


select job, Count(*) 'Total Employs', sum(sal) 'Total Salary',
		avg(sal) 'Average Sal', 
			max(sal) 'Max Sal', 
            min(sal) 'Min Sal' from Emp
group by job
having sum(sal) < 5000;

select job, Count(*) 'Total Employs', sum(sal) 'Total Salary',
		avg(sal) 'Average Sal', 
			max(sal) 'Max Sal', 
            min(sal) 'Min Sal' from Emp
group by job
having sum(sal) > 5000;

-- Display which dept contains more than 1 employee 

select job, Count(*) 'Total Employs', sum(sal) 'Total Salary',
		avg(sal) 'Average Sal', 
			max(sal) 'Max Sal', 
            min(sal) 'Min Sal' from Emp
group by job
having count(*) > 1;

-- The above query w.r.t. Where Clause 

select job, Count(*) 'Total Employs', sum(sal) 'Total Salary',
		avg(sal) 'Average Sal', 
			max(sal) 'Max Sal', 
            min(sal) 'Min Sal' from Emp
            where job in ('CLERK','MANAGER','SALESMAN')
group by job
having count(*) > 1;

-- apply where clause and order by on above query 

select job, Count(*) 'Total Employs', sum(sal) 'Total Salary',
		avg(sal) 'Average Sal', 
			max(sal) 'Max Sal', 
            min(sal) 'Min Sal' from Emp
            where job in ('CLERK','MANAGER','SALESMAN')
group by job
having count(*) > 1
order by job;



