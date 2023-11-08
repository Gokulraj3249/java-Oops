package Day_15;
abstract class Bike{
	abstract void run();
	void display() {
		System.out.println("Non-abs");
	}
}
public class Yemaka_abstract extends Bike{
	void run() {
		System.out.println("running safely");
	}

	public static void main(String[] args) {
	Bike obj=new Yemaka_abstract();
	obj.display();
	obj.run();

	}

}
