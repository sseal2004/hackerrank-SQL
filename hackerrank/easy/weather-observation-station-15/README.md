# Weather Observation Station 15

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Query the *Western Longitude* (*LONG\_W*) for the largest *Northern Latitude* (*LAT\_N*) in **STATION** that is less than $137.2345$. Round your answer to $4$ decimal places.

**Input Format**

The **STATION** table is described as follows:

<img src="https://s3.amazonaws.com/hr-challenge-images/9336/1449345840-5f0a551030-Station.jpg" title="Station.jpg" />

where *LAT\_N* is the northern latitude and *LONG\_W* is the western longitude. 

**Output Format**

## Solution

**Language:** SQL  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-08T03:44:43.007Z  

```sql
/*
Enter your query here.
*/
select round(long_w,4) from station where lat_n<137.2345 order by lat_n desc limit 1

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/weather-observation-station-15/problem)