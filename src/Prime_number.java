import java.util.Scanner;

public class Prime_number {

	public static void main(String[] args) {
		int n,count=0;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number: ");
		n=s.nextInt();
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				System.out.print(n+" is not a prime number");
				count++;
				break;
			}
		}
			if(count==0 && n!=1) {
				System.out.print(n+" is a prime number");
			}
				
		

	}

}
