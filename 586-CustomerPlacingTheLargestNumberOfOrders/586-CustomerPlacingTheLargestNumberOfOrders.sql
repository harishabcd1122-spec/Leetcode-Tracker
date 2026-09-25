-- Last updated: 9/25/2026, 12:51:31 PM
SELECT customer_number
FROM Orders 
GROUP BY customer_number
ORDER BY COUNT(customer_number) DESC
LIMIT 1;