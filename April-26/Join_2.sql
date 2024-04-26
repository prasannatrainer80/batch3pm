-- Implement Inner Join in EmployDetails and LeaveDetails table

select ED.EmpId, Name, Gender, Basic, 
LeaveId,LeaveStartDate,LeaveEndDate,LeaveReason,LeaveType
from EmployDetails ED INNER JOIN LeaveDetails LD ON
ED.EmpId = LD.EmpId ;

-- Implement Inner Join on Agent, Policy and AgentPolicy Tables 

select A.AgentId, FirstName,LastName,City,State,
P.PolicyID,AppNumber,AnnualPremium,PaymentModeId,ModalPremium
from Agent A Inner Join AgentPolicy AP 
ON A.AgentID=Ap.AgentID INNER JOIN Policy P 
ON P.PolicyID = AP.PolicyID;

-- Apply Left-Join on the Above Table

select A.AgentId, FirstName,LastName,City,State,
P.PolicyID,AppNumber,AnnualPremium,PaymentModeId,ModalPremium
from Agent A LEFT Join AgentPolicy AP 
ON A.AgentID=Ap.AgentID LEFT JOIN Policy P 
ON P.PolicyID = AP.PolicyID;

-- Apply Right Outer Join on Above Query

select A.AgentId, FirstName,LastName,City,State,
P.PolicyID,AppNumber,AnnualPremium,PaymentModeId,ModalPremium
from Agent A RIGHT Join AgentPolicy AP 
ON A.AgentID=Ap.AgentID RIGHT JOIN Policy P 
ON P.PolicyID = AP.PolicyID;

