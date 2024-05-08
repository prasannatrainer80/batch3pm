use hexapractice;

create table Employ
(
   Empno int,
   name varchar(30),
   Gender ENUM('MALE','FEMALE'),
   Dept varchar(30),
   Desig varchar(30),
   Basic numeric(9,2),
   primary key(empno)
);

Insert into Employ values(1,'Sadhana','FEMALE','Java','Developer',88555),
(2,'Satyam','MALE','Sql','Expert',84566),
(3,'Mayuri','FEMALE','Java','Developer',87774),
(4,'Shivendra','MALE','Sql','DBA',88563),
(5,'Mayuri','FEMALE','Sql','DBA',88633);