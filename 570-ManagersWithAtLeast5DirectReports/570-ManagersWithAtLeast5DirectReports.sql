-- Last updated: 7/9/2026, 3:06:52 PM
select e1.name
from employee as e1
inner join employee as e2
on e1.id = e2.managerId
group by e2.managerId
having count(*) >= 5;