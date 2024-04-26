select * from policy;

select annualpremium from policy order by annualpremium desc;

select distinct annualpremium from policy;

select max(annualpremium) from policy;

select max(annualpremium) from policy where annualpremium < 
(select max(annualpremium) from Policy);

select max(annualpremium) from policy where 
annualpremium < ( select max(annualpremium) from policy where annualpremium < 
(select max(annualpremium) from Policy));