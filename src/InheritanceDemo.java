
public class InheritanceDemo {

	public static void main(String[] args) {
		Circle c = new Circle(3.1);
		Circle c2 = new Circle(3.1);
		
		Cylinder cy = new Cylinder(4.1);
		Cylinder cy2 = new Cylinder(4.1);
		System.out.println("Cylinder Radious "+cy.radious);
		System.out.println("CylinderArea "+cy.getArea());
		System.out.println("Cylinder Radious "+cy.getRadious());
		c = cy;
		c =(Circle)cy; // same as above
		System.out.println("Circle hash code:"+c.hashCode());
		System.out.println("Cylinder hash code:"+cy.hashCode());
		System.out.println("Cy class name"+cy.getClass());
		System.out.println("C class name"+c.getClass());
		
		System.out.println("C2 class name"+c2.getClass());
		System.out.println("Cy2 class name"+cy2.getClass());
		
		System.out.println("C is instance of circle "+(c instanceof Circle));
		System.out.println("C is instance of cylinder "+(c instanceof Cylinder));
		
		System.out.println("Cy is instance of circle "+(cy instanceof Circle));
		System.out.println("Cy is instance of cylinder "+(cy instanceof Cylinder));
		
		System.out.println("C2 is instance of circle "+(c2 instanceof Circle));
		System.out.println("C2 is instance of cylinder "+(c2 instanceof Cylinder));
		
		System.out.println("Cy2 is instance of circle "+(cy2 instanceof Circle));
		System.out.println("Cy2 is instance of cylinder "+(cy2 instanceof Cylinder));
	}
	
}

 class Circle{
	public double radious;
	
	public Circle() {
		radious = 1;
		System.out.println("In circle");
	}
	
	public Circle(double radious) {
		this.radious = radious;
		System.out.println("In circle 2nd constructor");
	}
	
	public double getArea() {
		return 2 * Math.PI* radious * radious;
	}
	
	public double getRadious() {
		return radious;
	}
}

 class Cylinder extends Circle{
	 protected double length;
	 
	 public Cylinder() {
		 super();
		 length =1;
		 System.out.println("In cylinder");
	 }
	 
	 public Cylinder(double length) {
		 this.length = length;
		 System.out.println("In cylinder 2nd constructor");
	 }
	 
	 public double getLength() {
		 return length;
	 }
	 
	 public double getArea() {
		 return super.getArea()*length;
	 }
 }