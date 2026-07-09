-- Last updated: 7/9/2026, 3:08:03 PM
SELECT d.name AS Department,
       e.name AS Employee,
       e.salary AS Salary

FROM Employee e
LEFT JOIN Department d
ON e.departmentId = d.id

WHERE (e.departmentId, e.salary) IN
(
    SELECT departmentId,
           MAX(salary) AS Max_salary
    FROM Employee
    GROUP BY departmentId
);