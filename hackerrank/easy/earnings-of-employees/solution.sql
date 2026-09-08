/*
Enter your query here.
*/

select (months*salary)  as totalSal, count(*) from employee group by totalSal order by totalSal desc limit 1;
