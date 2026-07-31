# Write your MySQL query statement below
Select s.student_id , s.student_name , sub.subject_name ,COUNT(e.subject_name) as attended_exams
from Students s
cross join Subjects sub
Left join Examinations e
On s.student_id = e.student_id and sub.subject_name = e.subject_name
Group by s.student_id , s.student_name , sub.subject_name
Order by s.student_id , sub.subject_name;