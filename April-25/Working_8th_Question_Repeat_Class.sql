desc products;

desc orderdetails;
select OrderId, sum(Products.price * orderdetails.Quantity)
 from Products INNER JOIN orderdetails 
ON Products.ProductId = OrderDetails.ProductId;

select orderid, products.price * orderDetails.quantity 
from products INNER JOIN OrderDetails 
ON Products.ProductId = OrderDetails.ProductId;

select orderid, Sum(products.price * orderDetails.quantity)
from products INNER JOIN OrderDetails 
ON Products.ProductId = OrderDetails.ProductId
Group By OrderId;

Update Orders Od
INNER JOIN (
select orderid, Sum(products.price * orderDetails.quantity) TotalAmount
from products INNER JOIN OrderDetails 
ON Products.ProductId = OrderDetails.ProductId
Group By OrderId) AD 
ON Od.OrderiD = AD.OrderId
set od.totalAmount = AD.TotalAmount;

select * from Orders;