# Binary Tree Nodes

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_P(R)_ represents a pattern drawn by Julia in _R_ rows. The following pattern represents _P(5)_:

    * 
    * * 
    * * * 
    * * * * 
    * * * * *

Write a query to print the pattern _P(20)_.


**Input Format**

 

**Constraints**

 

**Output Format**

## Solution

**Language:** db2  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-06T15:27:11.469Z  

```db2

/*
    Enter your query here and follow these instructions:
    1. Please append a semicolon ";" at the end of the query and enter your query in a single line to avoid error.
    2. The AS keyword causes errors, so follow this convention: "Select t.Field From table1 t" instead of "select t.Field From table1 AS t"
    3. Type your code immediately after comment. Don't leave any blank line.
*/
select n ,
case 
when p is null then 'Root'
when n in (select P from BST) then 'Inner'
else 'Leaf'
end 
from BST order by n;

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/draw-the-triangle-2/problem)