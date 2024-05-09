create database template;

use template;
-- Customer Table

CREATE TABLE Customer (

    CustomerID INT PRIMARY KEY,

    FirstName VARCHAR(50) NOT NULL ,

    LastName VARCHAR(50) NOT NULL ,

    Email VARCHAR(100),

    PhoneNumber VARCHAR(18),

    Address VARCHAR(255),

    Username VARCHAR(50) NOT NULL UNIQUE,

    Password VARCHAR(255)NOT NULL ,

    RegistrationDate DATE

);
 
 
-- Customer Table

INSERT INTO Customer (CustomerID, FirstName, LastName, Email, PhoneNumber, Address, Username, Password, RegistrationDate)

VALUES

    (1, 'Ramesh', 'Patel', 'ramesh@example.com', '+91-1234567890', '123 Street, Mumbai', 'ramesh123', 'password123', '2024-04-01'),

    (2, 'Priya', 'Sharma', 'priya@example.com', '+91-9876543210', '456 Street, Delhi', 'priya456', 'password456', '2024-04-02'),

    (3, 'Amit', 'Singh', 'amit@example.com', '+91-8765432109', '789 Street, Kolkata', 'amit789', 'password789', '2024-04-03'),

    (4, 'Neha', 'Gupta', 'neha@example.com', '+91-7654321098', '456 Street, Bangalore', 'neha456', 'password456', '2024-04-04'),

    (5, 'Rajesh', 'Kumar', 'rajesh@example.com', '+91-6543210987', '789 Street, Hyderabad', 'rajesh789', 'password789', '2024-04-05'),

    (6, 'Pooja', 'Verma', 'pooja@example.com', '+91-5432109876', '123 Street, Chennai', 'pooja123', 'password123', '2024-04-06'),

    (7, 'Sandeep', 'Yadav', 'sandeep@example.com', '+91-4321098765', '456 Street, Pune', 'sandeep456', 'password456', '2024-04-07'),

    (8, 'Kavita', 'Jain', 'kavita@example.com', '+91-3210987654', '789 Street, Ahmedabad', 'kavita789', 'password789', '2024-04-08'),

    (9, 'Arun', 'Sharma', 'arun@example.com', '+91-2109876543', '123 Street, Jaipur', 'arun123', 'password123', '2024-04-09'),

    (10, 'Meena', 'Singh', 'meena@example.com', '+91-1098765432', '456 Street, Lucknow', 'meena456', 'password456', '2024-04-10'),

    (11, 'Anil', 'Yadav', 'anil@example.com', '+91-0987654321', '789 Street, Chandigarh', 'anil789', 'password789', '2024-04-11'),

    (12, 'Neeta', 'Patel', 'neeta@example.com', '+91-9876543210', '123 Street, Surat', 'neeta123', 'password123', '2024-04-12'),

    (13, 'Vijay', 'Kumar', 'vijay@example.com', '+91-8765432109', '456 Street, Indore', 'vijay456', 'password456', '2024-04-13'),

    (14, 'Sunita', 'Sharma', 'sunita@example.com', '+91-7654321098', '789 Street, Bhopal', 'sunita789', 'password789', '2024-04-14'),

    (15, 'Sanjay', 'Verma', 'sanjay@example.com', '+91-6543210987', '123 Street, Nagpur', 'sanjay123', 'password123', '2024-04-15');
