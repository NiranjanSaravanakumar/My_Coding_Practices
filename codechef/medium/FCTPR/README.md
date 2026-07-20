# FCTPR

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Factory Production

There are $N$ machines in a factory. The $i^{\text{th}}$ machine produces one item every $A_i$ seconds. Each machine works continuously and independently.

Your task is to determine the  **minimum**  time required to produce at least $X$ items in total.

### Input Format
- The first line contains two integers $N$ and $X$ — the number of machines and the required number of items.
- The second line contains $N$ space-separated integers $A_1, A_2, \ldots, A_N$, where $A_i$ denotes the time taken by the $i^{\text{th}}$ machine to produce one item.
### Output Format

Print a single integer — the minimum time required to produce at least $X$ items.

### Constraints
- $1 \le N \le 2 \times 10^5$
- $1 \le X \le 10^9$
- $1 \le A_i \le 10^9$
### Sample 1:
Input
Output

```
3 15
2 3 7
```

```
18
```

### Explanation:

In $18$ seconds:

- The first machine produces $9$ items.
- The second machine produces $6$ items.
- The third machine produces $2$ items.

A total of $17$ items are produced, which is at least $15$. It is not possible to produce $15$ items in less than $18$ seconds.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-07-20T16:28:04.231Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    static boolean canpro(long time ,int [] a,long x){
        long total =0;
        for(int t:a){
            total += time/t;
            if(total >= x)
                return true;
        }
        return false;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		int n = sc.nextInt();
		long x = sc.nextInt();
		
		int [] a = new int [n];
		int mintime = Integer.MAX_VALUE;
		for(int i=0;i<n;i++){
		    a[i] = sc.nextInt();
		    mintime = Math.min(mintime,a[i]);
		}
		long = l = 0;
		long h = (lon) mintime * x;
		long ans = h;
		
		while(l<=h){
		    long m = l+(h-l)/2;
		    if(canpro(m,a,x)){
		        ans = m;
		        h = m -1;
		    }
		    else{
		        l = mid +1;
		    }
		}
        System.out.println(ans);
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/FCTPR)