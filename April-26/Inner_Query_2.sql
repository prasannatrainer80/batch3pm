select AgentId,FirstName,LastName,City,State from Agent;

select PolicyId,AppNumber,AppDate,ModalPremium,PaymentModeId,AnnualPremium from Policy;

select Ad.AgentID, Ad.FirstName,Ad.City,Ad.State,
PD.PolicyId,Pd.ModalPremium,Pd.PaymentModeID,Pd.AnnualPremium
from
(select AgentId,FirstName,LastName,City,State from Agent) AD, 
(select PolicyId,AppNumber,AppDate,ModalPremium,PaymentModeId,AnnualPremium from Policy) PD;


