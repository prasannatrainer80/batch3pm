
create view vwOrderBill
AS
select OrderDetails.OrderId OrderId, sum(Products.price * orderdetails.Quantity) BillAMount
 from Products INNER JOIN orderdetails 
ON Products.ProductId = OrderDetails.ProductId
Group by OrderDetails.OrderId
order by OrderDetails.OrderId;

select OrderDetails.OrderId, sum(Products.price * orderdetails.Quantity) BillAMount
 from Products INNER JOIN orderdetails 
ON Products.ProductId = OrderDetails.ProductId
Group by OrderDetails.OrderId
order by OrderDetails.OrderId;

select * from Orders;

update orders set totalAmount=null;

Update Orders od INNER JOIN 
(select OrderDetails.OrderId, sum(Products.price * orderdetails.Quantity) BillAMount
 from Products INNER JOIN orderdetails 
ON Products.ProductId = OrderDetails.ProductId
Group by OrderDetails.OrderId
order by OrderDetails.OrderId) AD
ON od.Orderid = Ad.OrderId
set TotalAmount = AD.BillAmount 
