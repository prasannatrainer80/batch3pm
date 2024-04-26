desc customers;
desc products;

desc orders;
desc orderdetails;

select C.CustomerId,C.FirstName,C.LastName,P.ProductId,P.ProductName,O.OrderDate,O.TotalAmount,
Od.Quantity
from Customers C INNER JOIN Orders O 
ON C.CustomerId = O.CustomerId
INNER JOIN OrderDetails OD ON 
O.OrderId = OD.OrderID 
INNER JOIN Products P ON P.ProductID = Od.ProductID;

-- Example for Left-Outer Join


select C.CustomerId,C.FirstName,C.LastName,P.ProductId,P.ProductName,O.OrderDate,O.TotalAmount,
Od.Quantity
from Customers C LEFT JOIN Orders O 
ON C.CustomerId = O.CustomerId
LEFT JOIN OrderDetails OD ON 
O.OrderId = OD.OrderID 
LEFT JOIN Products P ON P.ProductID = Od.ProductID;


select OrderId,Products.price, orderdetails.Quantity,Products.Price
 from Products INNER JOIN orderdetails 
ON Products.ProductId = OrderDetails.ProductId;

select OrderId, Products.Price, OrderDetails.Quantity, Products.price * orderdetails.Quantity
 from Products INNER JOIN orderdetails 
ON Products.ProductId = OrderDetails.ProductId;

-- For each order how much total bill we need to calculate 

select orderId, sum(Products.price * OrderDetails.Quantity) 
from Products INNER JOIN OrderDetails ON Products.ProductId = OrderDetails.ProductId 
Group By OrderId;

-- Apply Right Join the given query

select C.CustomerId,C.FirstName,C.LastName,P.ProductId,P.ProductName,O.OrderDate,O.TotalAmount,
Od.Quantity
from Customers C RIGHT JOIN Orders O 
ON C.CustomerId = O.CustomerId
RIGHT JOIN OrderDetails OD ON 
O.OrderId = OD.OrderID 
RIGHT JOIN Products P ON P.ProductID = Od.ProductID;
