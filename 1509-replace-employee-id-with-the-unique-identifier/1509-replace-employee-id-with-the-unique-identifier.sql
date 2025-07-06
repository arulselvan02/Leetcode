# Write your MySQL query statement below
select E.name,U.unique_id
from Employees E
left join EmployeeUNI U
on e.id=u.id