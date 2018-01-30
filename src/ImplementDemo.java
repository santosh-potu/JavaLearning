
interface A{
	public void doSomeFun();
}

interface B{
	public void doSomeFun();
}

abstract class C{
	abstract protected void doSomeFun();
}

public class ImplementDemo extends C implements A,B  {
	public static void main(String[] args) {
		A a = new ImplementDemo();
		B b = new ImplementDemo();
		C c = new ImplementDemo();
		
		a.doSomeFun();
		b.doSomeFun();
		c.doSomeFun();
	}
	
	public void doSomeFun() {
		System.out.println("Be productiveSimple class name "+this.getClass().getSimpleName()+
				" Name "+this.getClass().getName());
	}
}
