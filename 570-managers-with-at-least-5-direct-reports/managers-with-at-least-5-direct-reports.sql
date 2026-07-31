# Write your MySQL query statement below
Select
    e1.name
From Employee e1
Inner Join Employee e2
On e1.id = e2.managerId
Group by e2.managerId
Having COUNT(e2.managerId) >= 5