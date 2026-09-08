# Japan Population

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Query the difference between the maximum and minimum populations in **CITY**.


**Input Format**

The **CITY** table is described as follows:
<img src="https://s3.amazonaws.com/hr-challenge-images/8137/1449729804-f21d187d0f-CITY.jpg" title="CITY.jpg" />

**Constraints**

 

**Output Format**

## Solution

**Language:** SQL  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-08T02:35:23.384Z  

```sql
select sum(population) from city where countrycode='JPN'

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/population-density-difference/problem)