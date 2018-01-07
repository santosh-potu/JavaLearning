import java.io.*;
import java.util.*;

public class FibonacciRecursive {
	public static void main(String[] args) {
		System.out.println("Enter an index for Fibonacci number");
		int n = MyInput.readInt();
		System.out.println("Fibonacci number at index "+n+" is "+fibo(n));
	}
	public static long fibo(long n) {
		if(n==0 || n==1) {
			return 1;
		}
		return fibo(n-1)+fibo(n-2);
	}


}


class MyInput{
	static private StringTokenizer stok;
	static private BufferedReader br 
	                         = new BufferedReader(new InputStreamReader(System.in));
	public static int readInt() {
		int i =0;
		try {
			String str = br.readLine();
			StringTokenizer stok = new StringTokenizer(str);
			i = new Integer(stok.nextToken()).intValue();
		}catch(Exception e) {
			System.out.println(e);
		}
		return i;
	}
	public static double readDouble() {
		double d =0;
		try {
			String str = br.readLine();
			StringTokenizer stok = new StringTokenizer(str);
			d = new Double(stok.nextToken()).doubleValue();
		}catch(Exception e) {
			System.out.println(e);
		}
		return d;
	}
}
