import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int c = sc.nextInt();
		int sum = 0;
		while(n-- >0){
		    sum += sc.nextInt();
		}
		if(sum <= c){
		    System.out.println("YES");
		}
		else{
		    System.out.println("NO");
		}

	}
}
