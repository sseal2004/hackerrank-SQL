# Type of Triangle

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Write a query identifying the *type* of each record in the **TRIANGLES** table using its three side lengths. Output one of the following statements for each record in the table:

- **Equilateral**: It's a triangle with $3$ sides of equal length.
- **Isosceles**: It's a triangle with $2$ sides of equal length.
- **Scalene**: It's a triangle with $3$ sides of differing lengths.
- **Not A Triangle**: The given values of *A*, *B*, and *C* don't form a triangle.

**Input Format**

The **TRIANGLES** table is described as follows:

<img src="https://s3.amazonaws.com/hr-challenge-images/12887/1443815629-ac2a843fb7-1.png" />

Each row in the table denotes the lengths of each of a triangle's three sides.

**Constraints**

 

**Output Format**

## Solution

**Language:** db2  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-06T18:31:36.760Z  

```db2

/*
    Enter your query here and follow these instructions:
    1. Please append a semicolon ";" at the end of the query and enter your query in a single line to avoid error.
    2. The AS keyword causes errors, so follow this convention: "Select t.Field From table1 t" instead of "select t.Field From table1 AS t"
    3. Type your code immediately after comment. Don't leave any blank line.
*/

select 
case
when (a + b <= c) or (b + c <= a) or (a + c <= b) then 'Not A Triangle'
when a = b and b=c and a=c then 'Equilateral'
when a<>b and b<>c and c<>a then 'Scalene'
else 'Isosceles'
end 
from triangles;

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/what-type-of-triangle/problem)