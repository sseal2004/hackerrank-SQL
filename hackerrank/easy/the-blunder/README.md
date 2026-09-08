# The Blunder

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Samantha was tasked with calculating the average monthly salaries for all employees in the **EMPLOYEES** table, but did not realize her keyboard's $0$ key was broken until after completing the calculation. She wants your help finding the difference between her miscalculation (using salaries with any zeros removed), and the actual average salary.

Write a query calculating the amount of error (i.e.: $actual - miscalculated$ average monthly salaries), and round it up to the next integer.

**Input Format**

The **EMPLOYEES** table is described as follows:

<img src="https://s3.amazonaws.com/hr-challenge-images/12893/1443817108-adc2235c81-1.png" />

**Note:**  *Salary* is per month.  

**Constraints**

 $1000 \lt \text{Salary} \lt 10^5$. 

**Output Format**

## Solution

**Language:** SQL  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-08T03:03:23.048Z  

```sql
/*
Enter your query here.
*/
select ceil(avg(Salary*1.0) - avg(replace(Salary, '0', '')*1.0)) from employees;


```

---

[View on HackerRank](https://www.hackerrank.com/challenges/the-blunder/problem)