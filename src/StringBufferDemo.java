
import java.io.*;

public class StringBufferDemo {
	private static BufferedReader bf ; 
	public static void main(String[] args) {
		try {
		bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer(10);
		System.out.println("Intial capacity:"+sb.capacity());
		sb.append("Test");
		sb.setLength(0);	
		System.out.println("Enter a String");
		sb.append(bf.readLine());
		System.out.println(" String is: "+sb.reverse().reverse());
		System.out.println("Now capacity:"+sb.capacity()+" & length:"+sb.length());;
		System.out.println("Reveresed String is: "+StringBufferDemo.reverseSb(sb));
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	
	public static String reverseSb(StringBuffer sb) {
		StringBuffer tmp = new StringBuffer();
		for(int i=sb.length()-1;i>=0;i--) {
			tmp.append(sb.charAt(i));
		}
		
		return tmp.toString();
	}
}
