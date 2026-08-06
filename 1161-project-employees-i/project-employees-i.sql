# Write your MySQL query statement below
Select p.project_id , IFNULL(ROUND(AVG(e.experience_years),2),0) as average_years 
From Project p
Left join Employee e
On p.employee_id = e.employee_id
Group by  p.project_id