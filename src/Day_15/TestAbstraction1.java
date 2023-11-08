package Day_15;
abstract class Shape{
	abstract void draw();
}
class Rectangle extends Shape{
	void draw() {
		System.out.println("Drawing rectangle");
	}
}
class Circle extends Shape{
	void draw() {
		System.out.println("Drawing Circle");
	}
}
public class TestAbstraction1 {

	public static void main(String[] args) {
		Shape r=new Rectangle();
		Shape c=new Circle();
		r.draw();
		c.draw();

	}

}
