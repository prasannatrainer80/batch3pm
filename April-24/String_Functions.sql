-- instr() : Used to display the first occurrence of given char. 

-- balaji name char 'a' exists multiple times we need to print first occurrence position 

select instr('balaji','a');

select Ename, instr(ename,'A') from Emp;

-- length() : Used to display total number of characters 

select length('Madhusree');

select ename, length(ename) from Emp;

-- Reverse() : Used to display string in reverse order 

select reverse('Hari Bhaskaran');

-- LEFT() : Display's no.of left-side chars
-- RIGHT() : Display's no.of right-side chars

select left('Satyam',4);

select right('Satyam',4);

-- LOWER() : Displays in lower-case 
-- UPPER() : Displays in upper-case 

select ename, lower(ename), upper(ename) from Emp;

-- concat() : Used to concatenate the given strings 

select concat('Aasiya',' ','Khan'); 

-- substring() : displays part of the string 

select substring('welcome to sql',5,10);

-- replace() : replaces string/char with new string/char in all occurrences 

select replace('Java Training','Java','Sql');