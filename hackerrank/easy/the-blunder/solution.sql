/*
Enter your query here.
*/
select ceil(avg(Salary*1.0) - avg(replace(Salary, '0', '')*1.0)) from employees;

