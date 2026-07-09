-- Last updated: 7/9/2026, 3:08:06 PM
SELECT email FROM Person
GROUP BY email
HAVING COUNT(email)>1;
