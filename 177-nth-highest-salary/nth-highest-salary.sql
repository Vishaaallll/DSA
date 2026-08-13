CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  DECLARE M INT;
  SET M = N -1;
  RETURN (
      # Write your MySQL query statement below.
        Select distinct salary 
        from  Employee
        Order by salary desc
        limit 1 OFFSET M
  );
END