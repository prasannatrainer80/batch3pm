
-- Display matching agent records from Agent and AgentPolicy 

select * from Agent where agentId = ANY(select agentId from AgentPolicy);

-- Display matching policy records from Agent and AgentPolicy 

select * from Policy where PolicyID = ANY(select policyId from AgentPolicy);

-- Display Agent records which exists in Agent table but not in agentpolicy (difference operator) IDLE Agents 

select * from Agent where AgentID <> ALL(select agentId from AgentPolicy);

-- Display Policy Records which exists in Policy Table but not in AgentPolicy Table (difference operator) IDLE Policies 

select * from Policy where PolicyID <> ALL (select PolicyID from AgentPolicy);