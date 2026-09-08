# Top Earners

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

We define an employee's *total earnings* to be their monthly $salary \times  months$ worked, and the *maximum total earnings* to be the maximum total earnings for any employee in the **Employee** table. Write a query to find the _maximum total earnings_ for all employees as well as the total number of employees who have maximum total earnings. Then print these values as $2$ space-separated integers.

**Input Format**

The **Employee** table containing employee data for a company is described as follows: 

<img src="https://s3.amazonaws.com/hr-challenge-images/19629/1458557872-4396838885-ScreenShot2016-03-21at4.27.13PM.png"/>

where _employee\_id_ is an employee's ID number, _name_ is their name, _months_ is the total number of months they've been working for the company, and _salary_ is the their monthly salary.

**Constraints**

 

**Output Format**

## Solution

**Language:** SQL  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-08T03:16:43.361Z  

```sql
/*
Enter your query here.
*/

select (months*salary)  as totalSal, count(*) from employee group by totalSal order by totalSal desc limit 1;

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/earnings-of-employees/problem)