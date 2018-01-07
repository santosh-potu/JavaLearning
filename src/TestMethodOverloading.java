
public class TestMethodOverloading {

	public static void main(String[] args) {
		
		System.out.println(" 1 ,2.0 greater one is - "+max(1,2.0));
	}
	
	static double max(double a,double b) {
		System.out.println("Double ");
		return (a>b)?a:b;
	}
	static int max(int a,int b) {
		System.out.println("int ");
		return (a>b)?a:b;
	}
}
