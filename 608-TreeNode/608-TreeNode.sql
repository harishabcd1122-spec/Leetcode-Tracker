-- Last updated: 9/25/2026, 12:51:14 PM
# Write your MySQL query statement below
SELECT id,

    CASE 
        WHEN p_id IS NULL THEN 'Root'
        WHEN id IN (SELECT p_id FROM Tree)THEN 'Inner'
        ELSE 'Leaf'
        END AS type
 FROM Tree
		