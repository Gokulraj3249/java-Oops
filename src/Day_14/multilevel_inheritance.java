package Day_14;

class Grand_father{
	void show1() {
		System.out.println("i am show function in grand_father class");
	}
}
class Father extends Grand_father{
	void show2() {
		System.out.println("i am show function in father class");
	}
}
class Son extends Father{
	void show3() {
		System.out.println("i am show function in son class");
	}
}
class Grand_son extends Son{
	void show4() {
		System.out.println("i am show function in grand_son class");
	}
}
public class multilevel_inheritance {

	public static void main(String[] args) {
		Grand_son gs=new Grand_son();
				gs.show4();
				gs.show3();
				gs.show2();
				gs.show1();
				
	}

}
