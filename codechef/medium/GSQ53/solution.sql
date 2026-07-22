/* Write a query which does the following */

-- Create a table 'customer'
create table customer(
id int primary key,
Name text,
Age int,
address text
);






-- Insert data into the table 
Insert Into customer
VALUES(1, 'John Smith', 25,  '123 Main St'),
(2, 'Sarah Johnson', 30,'456 Broadway'),
(3, 'Michael Brown', 45, '789 5th Ave'),
(4, 'Jessica Davis', 28, '321 Elm St'),
(5, 'David Lee', 35,  '555 Park Ave');

-- Output the entire table
select * from customer;