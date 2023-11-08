package Day_14;
class parent{
	void show() {
		System.out.println("i am parent");
	}
}
class son extends parent{
	void display() {
		System.out.println("i am son");
	}
}
class daughter extends parent{
	void display() {
		System.out.println("i am daughter");
	}
}
public class Hierarchical_inheritances {

	public static void main(String[] args) {
		son s=new son();
		daughter d=new daughter();
		s.show();
		d.show();
		s.display();
		d.display();
	}

}
