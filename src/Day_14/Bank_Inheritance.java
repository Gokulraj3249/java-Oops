package Day_14;
class Bank{
	int account_no=1305;
	String name="Ravi";
	float amount=3000;
}

public class Bank_Inheritance extends Bank{
	void deposit(int amount) {
		this.amount+=amount;
	}
	void withdraw(int amount) {
		this.amount-=amount;
	}
	public static void main(String[] args) {
		 Bank_Inheritance si=new  Bank_Inheritance();
		 si.deposit(1000);
		 System.out.println("Account Number: "+si.account_no);
		 System.out.println("Name: "+si.name);
		 System.out.println("Amount: "+si.amount);
		 

	}

}
