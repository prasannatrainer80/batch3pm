drop database if exists April_29_Part_2;

create database April_29_Part_2;

use April_29_Part_2;

-- create table Courses
CREATE TABLE courses (
  course_id INT PRIMARY KEY,
  course_name VARCHAR(50)
);

-- create table Students
CREATE TABLE students (
  student_id INT PRIMARY KEY,
  student_name VARCHAR(50),
  course_id INT,
  FOREIGN KEY (course_id) REFERENCES courses(course_id)
);

-- create table Grades
CREATE TABLE grades (
  student_id INT PRIMARY KEY,
  student_name VARCHAR(50),
  grade INT,
  FOREIGN KEY (student_id) REFERENCES students(student_id)
);

-- Inserting sample data into Courses
INSERT INTO courses (course_id, course_name)
VALUES (1, 'Math'), (2, 'History'), (3, 'Science');

-- Inserting sample data into Students
INSERT INTO students (student_id, student_name, course_id)
VALUES (1, 'Alice', 1), (2, 'Bob', 2), (3, 'Charlie', 3);

-- Inserting sample data into Grades
INSERT INTO grades (student_id, student_name, grade)
VALUES (1, 'Alice', 90), (2, 'Bob', 85), (3, 'Charlie', 92);

select * from students;
select * from courses;
select * from grades;

-- Updating grades for students in the 'Science' course
UPDATE students
JOIN courses ON students.course_id = courses.course_id
JOIN grades ON students.student_id = grades.student_id
SET grades.grade = grades.grade + 5
WHERE courses.course_name = 'Science';
