-- Last updated: 7/9/2026, 3:08:04 PM
SELECT name AS Customers
FROM Customers
LEFT JOIN Orders ON Customers.id=Orders.customerId
WHERE Orders.customerId IS NULL;
