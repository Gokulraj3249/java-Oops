package Day_15;
interface Inter1{
	public void fun1();
}
interface Inter2 extends Inter1{
	public void fun2();
}
class InterImple implements Inter1,Inter2{
	public void fun1() {
		System.out.println("Interface 1");
	}
	public void fun2() {
		System.out.println("Interface 2");
	}
}
public class mainClassForInterface {

	public static void main(String[] args) {
		InterImple obj1=new InterImple();
		Inter2 obj2=new InterImple();
//		obj1.fun1();
		obj2.fun1();
		obj2.fun2();
		

	}

}
