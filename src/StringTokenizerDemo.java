import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		String s = "Learning java is harder right?";
		StringTokenizer st = new StringTokenizer(s);//," ",true); // space is also token here
		System.out.println("Total no of words are "+st.countTokens());
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
