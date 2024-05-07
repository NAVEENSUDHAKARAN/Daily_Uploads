
use Student;
create table Add_Stock_Details(ID int unique,
Product_Name varchar(50),
Number_of_Stock int,
Stocked_Date varchar(10),
Price int);

delete from Add_Stock_Details where ID = 222222; 

update Add_Stock_Details
set ID=202 where Product_Name = 'Mango';
select * from Add_Stock_Details
order by ID;
select * from Add_Stock_Details;
delete from Add_Stock_Details where Product_Name = 'Banana';

alter table Add_Stock_Details add Customer_Order int;
Select * from Add_Stock_Details where ID >=201 and ID < 300 ;
