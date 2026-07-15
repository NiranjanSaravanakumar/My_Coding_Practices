class Solution:
    def gcdOfOddEvenSums(self, n: int) -> int:
        esum,osum=0,0

        for i in range(1,2*n+1):
            if i%2 != 0:
                osum += i
            else:
                esum += i
        
        while(esum!=0):
            temp = esum
            esum = osum%esum
            osum = temp
        return osum