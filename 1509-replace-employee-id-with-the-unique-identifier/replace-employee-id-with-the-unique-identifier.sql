# Write your MySQL query statement below
SELECT eu.unique_id as unique_id , e.name
FROM Employees e
Left Join EmployeeUNI eu
on e.id = eu.id ;