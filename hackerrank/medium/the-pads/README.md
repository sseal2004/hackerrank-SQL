# The PADS

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Generate the following two result sets:

1. Query an *alphabetically ordered* list of all names in **OCCUPATIONS**, immediately followed by the first letter of each profession as a parenthetical (i.e.: enclosed in parentheses). For example: `AnActorName(A)`, `ADoctorName(D)`, `AProfessorName(P)`, and `ASingerName(S)`.  
2. Query the number of ocurrences of each occupation in **OCCUPATIONS**. Sort the occurrences in *ascending order*, and output them in the following format:	<br>
		
        There are a total of [occupation_count] [occupation]s.

    where `[occupation_count]` is the number of occurrences of an occupation in **OCCUPATIONS** and `[occupation]` is the *lowercase* occupation name. If more than one *Occupation* has the same `[occupation_count]`, they should be ordered alphabetically.
    
**Note:** There will be at least two entries in the table for each type of occupation.

**Input Format**

The **OCCUPATIONS** table is described as follows:
<img src="https://s3.amazonaws.com/hr-challenge-images/12889/1443816414-2a465532e7-1.png" />
*Occupation* will only contain one of the following values: **Doctor**, **Professor**, **Singer** or **Actor**.

**Constraints**

 

**Output Format**

## Solution

**Language:** SQL  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-07T17:39:50.254Z  

```sql
/*
Enter your query here.
*/

select concat(name,'(',left(occupation,1),')')  from occupations order by name;

select concat('There are a total of',' ',count(*),' ',lower(occupation),'s.') from occupations
group by occupation order by count(*),occupation asc;
 

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/the-pads/problem)