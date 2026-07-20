# CONN01

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Group Formation

You are given an undirected graph with $N$ vertices and $M$ edges.

 **Assign**  every vertex to a group such that any two vertices connected by a path are assigned to the same group.

Each group must have exactly one leader.

Determine:

- The maximum possible number of groups.
- The number of ways to choose the group leaders.

Since the number of ways can be large, print it modulo $10^9+7$.

### Input Format
- The first line contains a single integer $T$, the number of test cases.
- Each test case begins with two integers $N$ and $M$.
- The next $M$ lines each contain two integers $u$ and $v$, indicating an undirected edge between vertices $u$ and $v$.
### Output Format

For each test case, print two space-separated integers:

- the maximum possible number of groups;
- the number of ways to choose the group leaders modulo $10^9+7$.
### Constraints
- $1 \le T \le 5$
- $1 \le N \le 10^5$
- $0 \le M \le 10^5$
- $1 \le u, v \le N$
- $u \ne v$
- There is at most one edge between any pair of vertices.
### Sample 1:
Input
Output

```
1
8 5
1 2
2 3
4 5
5 6
7 8
```

```
3 18
```

### Explanation:

The connected groups are:

- $\{1,2,3\}$
- $\{4,5,6\}$
- $\{7,8\}$

Thus, the maximum possible number of groups is $3$.
The number of ways to choose the leaders is $18$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-07-20T14:05:48.014Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CONN01)