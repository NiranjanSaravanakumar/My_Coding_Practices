# DOUBLERENT - Rating 234

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Double Rent

Chefina decided to move into Chef's apartment.
Chef was initially paying a rent of $X$ rupees. Since Chefina is moving in, the owner decided to  **double**  the rent.

Find the final rent Chef needs to pay.

### Input Format

The input consists of a single integer $X$, denoting the rent Chef was initially paying.

### Output Format

Output on a new line, the final rent Chef needs to pay.

### Constraints
- $1 \leq X \leq 10$
### Sample 1:
Input
Output

```
2
```

```
4
```

### Explanation:

Chef was initially paying $2$ rupees. After Chefina moves in, he needs to pay $2\cdot 2 = 4$ rupees.

### Sample 2:
Input
Output

```
3
```

```
6
```

### Explanation:

Chef was initially paying $3$ rupees. After Chefina moves in, he needs to pay $2\cdot 3 = 6$ rupees.

### Sample 3:
Input
Output

```
10
```

```
20
```

### Explanation:

Chef was initially paying $10$ rupees. After Chefina moves in, he needs to pay $2\cdot 10 = 20$ rupees.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-07-15T04:05:42.901Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(n * 2);

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/DOUBLERENT)