package Day_16;

import java.util.Scanner;

public class Recursion_SumOfAllNumbers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		long sumOfAllNumbers=sumOfAllNumbers(n);
		System.out.println(sumOfAllNumbers);

	}
	public static long sumOfAllNumbers(long number)
	{
		if(number !=0) {
			return number + sumOfAllNumbers(number-1);
			
		}
		else {
			return number;
		}
	}

}
