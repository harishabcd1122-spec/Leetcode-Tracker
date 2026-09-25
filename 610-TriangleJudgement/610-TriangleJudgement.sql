-- Last updated: 9/25/2026, 12:51:11 PM
# Write your MySQL query statement below
select *, if(x+y>z and y+z>x and x+z>y, "Yes","No") as triangle from triangle