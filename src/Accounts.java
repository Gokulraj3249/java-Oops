import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Accounts {
	static long id;
	static String name,add;
	static int deam;
	static long cont;
    //class variable
    
    static void display(long id,String name,String add,long cont,int deam) {
    	
    	System.out.println("Account details");
    	System.out.println("Account Id: "+id);
    	System.out.println("Account Name: "+name);
    	System.out.println("Address: "+add);
    	System.out.println("Contact: "+cont);
    	System.out.println("Amount: "+deam);
    }

	public static void main(String[] args) throws IOException {
		Scanner s=new Scanner(System.in);
		System.out.print("Account Id: ");
		id=s.nextLong();
		System.out.print("Account Name: ");
		name=s.next();
		System.out.print("Address: ");
		DataInputStream obj=new DataInputStream(System.in);
		String add=obj.readLine();
		System.out.print("Contact: ");
		cont=s.nextLong();
		System.out.print("Deposit amount: ");
		deam=s.nextInt();
		display(id,name,add,cont,deam);
		s.close();

	}

}
