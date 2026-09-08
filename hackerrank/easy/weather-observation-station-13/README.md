# Weather Observation Station 13

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Query the sum of *Northern Latitudes* (*LAT\_N*) from **STATION** having values greater than $38.7880$ and less than $137.2345$. Truncate your answer to $4$ decimal places.


**Input Format**

The **STATION** table is described as follows:

<img src="https://s3.amazonaws.com/hr-challenge-images/9336/1449345840-5f0a551030-Station.jpg" title="Station.jpg" />

where *LAT\_N* is the northern latitude and *LONG\_W* is the western longitude. 

**Output Format**

## Solution

**Language:** SQL  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-08T03:33:11.600Z  

```sql
/*
Enter your query here.
*/

select truncate(sum(lat_n),4) from station where lat_n  between 38.7880 and 137.2345

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/weather-observation-station-13/problem)