# Binary Tree Nodes

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given a table, <em>BST</em>, containing two columns: <em>N&nbsp;</em>and <em>P,</em>&nbsp;where <em>N</em> represents the value of a node in <em>Binary Tree</em>, and <em>P</em> is the parent of <em>N</em>.

<img src="https://s3.amazonaws.com/hr-challenge-images/12888/1443818507-5095ab9853-1.png" />

Write a query to find the node type of <em>Binary Tree</em> ordered by the value of the node. Output one of the following for each node:

<ul>
	<li><em>Root</em>: If node is root node.</li>
	<li><em>Leaf</em>: If node is leaf node.</li>
	<li><em>Inner</em>: If node is neither root nor leaf node.</li>
</ul>

__Sample Input__

<img src="https://s3.amazonaws.com/hr-challenge-images/12888/1443818467-30644673f6-2.png" />

__Sample Output__

    1 Leaf
    2 Inner
    3 Leaf
    5 Root
    6 Leaf
    8 Inner
    9 Leaf

<br>
__Explanation__

The <em>Binary Tree</em> below illustrates the sample:

<img src="https://s3.amazonaws.com/hr-challenge-images/12888/1443773633-f9e6fd314e-simply_sql_bst.png" />

**Input Format**

 

**Constraints**

 

**Output Format**

## Solution

**Language:** db2  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-06T15:27:06.248Z  

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

[View on HackerRank](https://www.hackerrank.com/challenges/binary-search-tree-1/problem)