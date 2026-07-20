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
