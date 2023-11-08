package Day_15;
abstract class Bank{
	abstract int getRateOfInterest();
}
class SBI extends Bank{
	int getRateOfInterest() {
		return 7;
	}
}
class ICICI extends Bank{
	int getRateOfInterest() {
		return 8;
	}
}
public class TestBank {

	public static void main(String[] args) {
		Bank b;
		b=new SBI();
		System.out.println("Rate of Interest is:"+b.getRateOfInterest()+"%");
		b=new ICICI();
		System.out.println("Rate of Interest is:"+b.getRateOfInterest()+"%");

	}

}
