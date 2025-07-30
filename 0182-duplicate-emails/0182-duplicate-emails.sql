SELECT email AS email
FROM Person
GROUP BY email
HAVING COUNT(*) > 1;
