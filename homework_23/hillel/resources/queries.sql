SELECT city, count(*) cnt from hr where "Age in Yrs." BETWEEN 0 AND 20 group by city order by cnt desc
SELECT city, count(*) cnt from hr where "Age in Yrs." BETWEEN 20 AND 40 group by city order by cnt desc
SELECT city, count(*) cnt from hr where "Age in Yrs." BETWEEN 40 AND 60 group by city order by cnt desc
SELECT city, count(*) cnt from hr where "Age in Yrs." BETWEEN 60 AND 80 group by city order by cnt desc
SELECT city, count(*) cnt from hr where "Age in Yrs." BETWEEN 80 AND 100 group by city order by cnt desc

SELECT city, count(*) cnt_f from hr where "Age in Yrs." BETWEEN 0 AND 20 AND  "Gender" = "F" group by city order by cnt_f desc
SELECT city, count(*) cnt_m from hr where "Age in Yrs." BETWEEN 0 AND 20 AND  "Gender" = "M" group by city order by cnt_m desc
SELECT city, count(*) cnt_f from hr where "Age in Yrs." BETWEEN 20 AND 40 AND  "Gender" = "F" group by city order by cnt_f desc
SELECT city, count(*) cnt_m from hr where "Age in Yrs." BETWEEN 20 AND 40 AND  "Gender" = "M" group by city order by cnt_m desc
SELECT city, count(*) cnt_f from hr where "Age in Yrs." BETWEEN 40 AND 60 AND  "Gender" = "F" group by city order by cnt_f desc
SELECT city, count(*) cnt_m from hr where "Age in Yrs." BETWEEN 40 AND 60 AND  "Gender" = "M" group by city order by cnt_m desc
SELECT city, count(*) cnt_f from hr where "Age in Yrs." BETWEEN 60 AND 80 AND  "Gender" = "F" group by city order by cnt_f desc
SELECT city, count(*) cnt_m from hr where "Age in Yrs." BETWEEN 60 AND 80 AND  "Gender" = "M" group by city order by cnt_m desc
SELECT city, count(*) cnt_f from hr where "Age in Yrs." BETWEEN 80 AND 100 AND  "Gender" = "F" group by city order by cnt_f desc
SELECT city, count(*) cnt_m from hr where "Age in Yrs." BETWEEN 80 AND 100 AND  "Gender" = "M" group by city order by cnt_m desc

select avg(Salary) from hr

select Salary, count(*) cnt from hr group by "Salary" order by cnt desc limit 1

SELECT * FROM (
SELECT DISTINCT Salary,
    PERCENT_RANK() OVER ( ORDER BY Salary ) SalaryRank
FROM hr
order by SalaryRank desc )
WHERE SalaryRank > 0.95
order by SalaryRank asc
LIMIT 1

SELECT * FROM (
SELECT DISTINCT Salary,
    PERCENT_RANK() OVER ( ORDER BY Salary ) SalaryRank
FROM hr
order by SalaryRank desc )
WHERE SalaryRank > 0.99
order by SalaryRank asc
LIMIT 1