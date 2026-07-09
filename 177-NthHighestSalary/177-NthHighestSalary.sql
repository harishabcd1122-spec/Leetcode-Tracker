-- Last updated: 7/9/2026, 3:08:12 PM
CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
SET N=N-1;
  RETURN (
    SELECT DISTINCT(salary) from Employee order by salary DESC
    LIMIT 1 OFFSET N
  );
END