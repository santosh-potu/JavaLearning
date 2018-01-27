
public class ArgumentsDemo {
	public static void main() {
		System.out.println("Plain Method overriden without arguments");
		//Never works
	}
	public static void main(String[] args) {
		if(args == null) {
			System.out.println("Null arguments"); // will not work
		}
		if(args.length > 0) {
			System.out.println("Arguments Supplied are..");
			for(String arg:args) {
				System.out.println(arg);
			}
		}else {
			System.out.println("No arguments provided");
		}
		
		System.out.println("Class name is: "+ArgumentsDemo.class.getName());
	}
}
