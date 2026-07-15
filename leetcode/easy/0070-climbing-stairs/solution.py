class Solution:
    def climbStairs(self, n: int) -> int:
        a,b,res = 0,1,0
        
        for _ in range(n):
            res = a+b
            a = b
            b = res
            
        return res