# Weather Observation Station 19

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

A *[median](https://en.wikipedia.org/wiki/Median)* is defined as a number separating the higher half of a data set from the lower half. Query the *median* of the *Northern Latitudes* (*LAT\_N*) from **STATION** and round your answer to $4$ decimal places. 


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
**Submitted:** 2026-09-08T04:22:56.622Z  

```sql
/*
Enter your query here.
*/
select round(sqrt(power(max(lat_n)-min(lat_n),2)+power(max(long_w)-min(long_w),2)),4) from station

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/weather-observation-station-20/problem)