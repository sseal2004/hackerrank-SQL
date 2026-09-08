# Weather Observation Station 19

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Consider $P_1(a, c)$ and $P_2(b, d)$ to be two points on a 2D plane where $(a, b)$ are the respective minimum and maximum values of *Northern Latitude* (*LAT\_N*) and $(c, d)$ are the respective minimum and maximum values of *Western Longitude* (*LONG\_W*) in **STATION**. 

Query the [Euclidean Distance](https://en.wikipedia.org/wiki/Euclidean_distance) between points $P_1$ and $P_2$ and *format your answer* to display $4$ decimal digits.

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
**Submitted:** 2026-09-08T04:22:32.846Z  

```sql
/*
Enter your query here.
*/
select round(sqrt(power(max(lat_n)-min(lat_n),2)+power(max(long_w)-min(long_w),2)),4) from station

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/weather-observation-station-19/problem)