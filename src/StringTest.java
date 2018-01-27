
class StringTest {

	public static void main(String[] args) {
		String s = new String();
		System.out.println(s.length()+" Is the string length");
		s = "Santosh is a good boy!";
		System.out.println(s);
		s = s + " No need to say again!";
		System.out.println(s);
		for(int i=0;i<s.length();i++) {
			System.out.println("Charecter at position "+i+" is ->"+s.charAt(i));
		}
	}

}
