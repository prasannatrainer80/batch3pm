select max(annualPremium) from Policy P1 where 2-1 =
(select count(distinct annualPremium) from Policy P2 where 
p2.annualPremium > P1.annualPremium);

select max(annualPremium) from Policy P1 where 3-1 =
(select count(distinct annualPremium) from Policy P2 where 
p2.annualPremium > P1.annualPremium);