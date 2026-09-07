# Revising Aggregations - Averages

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Query the average population for all cities in **CITY**, rounded *down* to the nearest integer.

**Input Format**

The **CITY** table is described as follows:
<img src="https://s3.amazonaws.com/hr-challenge-images/8137/1449729804-f21d187d0f-CITY.jpg" title="CITY.jpg" />

**Output Format**

## Solution

**Language:** SQL  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-07T18:17:12.797Z  

```sql
select avg(population) from city where district='California'

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/average-population/problem)