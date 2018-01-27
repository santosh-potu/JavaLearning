import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SpecialInput {
	static private StringTokenizer stok;
	static private BufferedReader br 
		                         = new BufferedReader(new InputStreamReader(System.in));
	public static int readInt() throws java.lang.NumberFormatException{
		int i =0;
		try {
			String str = br.readLine();
			StringTokenizer stok = new StringTokenizer(str);
			i = new Integer(stok.nextToken()).intValue();
		}catch(NumberFormatException ne) {
			throw new java.lang.NumberFormatException("Invalid Integer");
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


