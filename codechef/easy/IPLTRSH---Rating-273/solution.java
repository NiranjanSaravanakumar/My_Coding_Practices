import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		
		while(t-- > 0){
		    int st = sc.nextInt();
		    int ti = sc.nextInt();
		    if(st > ti){
		        System.out.println(st - ti);
		    }
		    else{
		        System.out.println(0);
		    }
		}

	}
}
