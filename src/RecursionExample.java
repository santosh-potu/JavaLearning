
public class RecursionExample {

	public static void main(String[] args) {
		System.out.println("Factorial of 9 is "+fact(9));
	}
	
	static int fact(int num) {
		System.out.println(num);
		if(num > 1) {			
			return num *  fact(num-1);
		}
		
		return 1;
		
			
	}
}
