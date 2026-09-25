-- Last updated: 9/25/2026, 12:50:08 PM
# Write your MySQL query statement below
SELECT player_id, MIN(event_date) AS first_login
FROM Activity
GROUP BY player_id;