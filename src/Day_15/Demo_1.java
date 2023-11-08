package Day_15;
interface My{
	public void method1();
	public void method2();
}
class Demo_1 implements My{
	public void method1() {
		System.out.println("implement of method1");
	}
	public void method2() {
		System.out.println("implement of method2");
	}

	public static void main(String[] args) {
	My obj=new Demo_1();
	obj.method1();
	obj.method2();

	}

}
