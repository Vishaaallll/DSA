# Write your MySQL query statement below
Select query_name , ROUND(AVG(rating / position ),2)  as quality ,ROUND(AVG(IF(rating <3,1,0))*100,2) AS poor_query_percentage
from Queries
group by query_name