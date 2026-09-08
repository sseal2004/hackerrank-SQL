# Weather Observation Station 16

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Query the *Western Longitude* (*LONG\_W*)where the smallest *Northern Latitude* (*LAT\_N*) in **STATION** is greater than $38.7780$. Round your answer to $4$ decimal places.

**Input Format**

The **STATION** table is described as follows:

<img src="https://s3.amazonaws.com/hr-challenge-images/9336/1449345840-5f0a551030-Station.jpg" title="Station.jpg" />

where *LAT\_N* is the northern latitude and *LONG\_W* is the western longitude. 

**Constraints**

 

**Output Format**

## Solution

**Language:** SQL  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-08T03:49:00.801Z  

```sql
/*
Enter your query here.
*/
select round(min(lat_n),4) from station where lat_n > 38.7780 

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/weather-observation-station-17/problem)