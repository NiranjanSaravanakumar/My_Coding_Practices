import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int[] bb = new int [2];
	    for(int i=0;i<2;i++){
	        bb[i] = sc.nextInt();
	    }
	    int [] tr = new int [2];
	    for(int i=0;i<2;i++){
	        tr[i] = sc.nextInt();
	    }
        int sum =0;
        
        for(int i=0;i<2;i++){
            sum += (bb[i]*tr[i]);
        }
        System.out.println(sum);
	}
}
