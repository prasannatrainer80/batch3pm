drop database if exists april29;

create database april29;

use april29;

-- Creating sample tables
CREATE TABLE students (
    studentid INT PRIMARY KEY,
    studentname VARCHAR(50),
    age INT
);

CREATE TABLE age_increase (
    studentid INT PRIMARY KEY,
    age_increase_amount INT
);

-- Inserting sample data
INSERT INTO students VALUES
(1, 'Tina', 20),
(2, 'Isha', 22),
(3, 'Rahul', 21);

INSERT INTO age_increase VALUES
(1, 2),
(3, 1);

Update Students S
INNER JOIN Age_Increase AI  ON 
S.studentId = AI.studentID 
set S.Age = S.Age + AI.age_increase_amount;

select * from Students;

