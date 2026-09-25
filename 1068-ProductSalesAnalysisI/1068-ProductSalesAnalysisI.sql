-- Last updated: 9/25/2026, 12:50:16 PM
# Write your MySQL query statement below
SELECT 
    p.product_name, 
    s.year, 
    s.price
FROM 
    Sales s
JOIN 
    Product p ON s.product_id = p.product_id;