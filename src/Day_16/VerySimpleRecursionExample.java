package Day_16;

import java.util.Scanner;

public class VerySimpleRecursionExample {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		long n=s.nextLong();
		callMyself(n);

	}

	public static void callMyself(long i) {
		if(i<=0) {
			return;
		}
		System.out.print(i+" ");
		i=i-1;
		callMyself(i);
	}
}
