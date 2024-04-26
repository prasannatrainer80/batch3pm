select C.CCode,C.Name,Duration,Fee,
F.FacCode,F.Name,QUal,B.BCode,StDate,Enddate,
S.RollNo,S.Name,S.Gender,S.Phone
from Courses C INNER JOIN Batches B 
ON C.CCODE = B.CCODE
INNER JOIN Faculty F ON 
F.FacCode = B.FacCode 
INNER JOIN Students S ON
S.BCode = B.BCode;

-- The above query apply w.r.t. Left-Outer Join then 

select C.CCode,C.Name,Duration,Fee,
F.FacCode,F.Name,QUal,B.BCode,StDate,Enddate,
S.RollNo,S.Name,S.Gender,S.Phone
from Courses C LEFT JOIN Batches B 
ON C.CCODE = B.CCODE
LEFT JOIN Faculty F ON 
F.FacCode = B.FacCode 
LEFT JOIN Students S ON
S.BCode = B.BCode;

-- The above query w.r.t. Right Join

select C.CCode,C.Name,Duration,Fee,
F.FacCode,F.Name,QUal,B.BCode,StDate,Enddate,
S.RollNo,S.Name,S.Gender,S.Phone
from Courses C RIGHT JOIN Batches B 
ON C.CCODE = B.CCODE
RIGHT JOIN Faculty F ON 
F.FacCode = B.FacCode 
RIGHT JOIN Students S ON
S.BCode = B.BCode;
