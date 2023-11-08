package Day_15;
class Overloading{
	void demo(int a) {
		System.out.println("a: "+a);
	}
	void demo(int a,int b) {
		System.out.println("a and b :"+a +","+b);
	}
	double demo(double a) {
		System.out.println("double a: "+a);
		return a*a;
	}
	
}
public class MethodOverloading {

	public static void main(String[] args) {
		Overloading obj=new Overloading();
		double result;
		obj.demo(10);
		obj.demo(32, 49);
		result=obj.demo(5.5);
		System.out.println("Output: "+result);

	}

}
