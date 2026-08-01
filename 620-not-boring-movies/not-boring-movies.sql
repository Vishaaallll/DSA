# Write your MySQL query statement below
SELECT
    id , movie , description,rating
FROM Cinema c
WHERE c.description  != 'boring' 
AND  id % 2 != 0
ORDER BY c.rating desc