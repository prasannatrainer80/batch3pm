select * from batches;

select * from courses;

-- Find the maching records from courses and batches tables (which exists in both courses and batches table(s))

select * from courses where ccode = ANY(select ccode from batches);

-- Find the Idle coures ( as for which students are not registered ) 

select * from courses where ccode <>  ALL(select ccode from batches);
