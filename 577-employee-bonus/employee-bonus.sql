# Write your MySQL query statement below
Select e.name , b.bonus
from Employee e
Left join Bonus b
On e.empId = b.empId
where  b.bonus is null or b.bonus < 1000 ;