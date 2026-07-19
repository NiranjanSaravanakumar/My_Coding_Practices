import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int b1 = sc.nextInt();
        int b2 = sc.nextInt();

        int t1 = sc.nextInt();
        int t2 = sc.nextInt();

        int sum = b1 * t1 + b2 * t2;

        System.out.println(sum);
    }
}