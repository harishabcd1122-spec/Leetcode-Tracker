-- Last updated: 7/9/2026, 3:06:23 PM
# Write your MySQL query statement below
SELECT product_id , year as first_year , quantity , price
FROM Sales
WHERE (product_id,year) IN (
    SELECT product_id , MIN(year)
    FROM sales
    GROUP BY product_id
    )

