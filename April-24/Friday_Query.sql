select addDate(addDate(last_day(adddate(last_day(curdate()), INTERVAL -1 MONTH)),interval 1 day),
INTERVAL 6-dayofweek(addDate(last_day(adddate(last_day(curdate()), INTERVAL -1 MONTH)),interval 1 day)) DAY) 'first friday',
adddate(addDate(addDate(last_day(adddate(last_day(curdate()), INTERVAL -1 MONTH)),interval 1 day),
INTERVAL 6-dayofweek(addDate(last_day(adddate(last_day(curdate()), INTERVAL -1 MONTH)),interval 1 day)) DAY) ,interval 7 day)  'second friday',
adddate(adddate(addDate(addDate(last_day(adddate(last_day(curdate()), INTERVAL -1 MONTH)),interval 1 day),
INTERVAL 6-dayofweek(addDate(last_day(adddate(last_day(curdate()), INTERVAL -1 MONTH)),interval 1 day)) DAY) ,interval 7 day) ,interval 7 day) 'third friday',
adddate(adddate(adddate(addDate(addDate(last_day(adddate(last_day(curdate()), INTERVAL -1 MONTH)),interval 1 day),
INTERVAL 6-dayofweek(addDate(last_day(adddate(last_day(curdate()), INTERVAL -1 MONTH)),interval 1 day)) DAY) ,interval 7 day) ,interval 7 day) ,interval 7 day) 'Fourth Friday',
case when
month(adddate(adddate(adddate(adddate(addDate(addDate(last_day(adddate(last_day(curdate()), INTERVAL -1 MONTH)),interval 1 day),
INTERVAL 6-dayofweek(addDate(last_day(adddate(last_day(curdate()), INTERVAL -1 MONTH)),interval 1 day)) DAY) ,interval 7 day) ,interval 7 day) ,interval 7 day)
, INTERVAL 7 Day)) = month(curdate()) then 
adddate(adddate(adddate(adddate(addDate(addDate(last_day(adddate(last_day(curdate()), INTERVAL -1 MONTH)),interval 1 day),
INTERVAL 6-dayofweek(addDate(last_day(adddate(last_day(curdate()), INTERVAL -1 MONTH)),interval 1 day)) DAY) ,interval 7 day) ,interval 7 day) ,interval 7 day)
, INTERVAL 7 Day) else 'No Fifth Friday ' end  'Fifth friday';
