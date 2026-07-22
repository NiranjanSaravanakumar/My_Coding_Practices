# GSQ11

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** SQL  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-07-22T12:06:12.341Z  

```sql
/* Write a query which does the following
- Add a new column 'Hourly_Pay' to the table employee and set the value as 100 by default.
- Output the entire table
*/
alter table employee add column Hourly_Pay int default 100;
select * from employee;
```

---

[View on CodeChef](https://www.codechef.com/problems/GSQ11)