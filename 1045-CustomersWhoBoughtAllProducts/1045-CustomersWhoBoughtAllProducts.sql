-- Last updated: 9/25/2026, 12:50:24 PM
# Write your MySQL query statement below

SELECT  customer_id FROM Customer GROUP BY customer_id
HAVING COUNT(distinct product_key) = (SELECT COUNT(product_key) FROM Product)