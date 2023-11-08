package Day_16;

public class Recursive_Fibonnaci {

	public static void main(String[] args) {
		for(long i=1;i<=9;i++) {
			System.out.print(fibonnaci(i)+" ");
		}
		System.out.println();
	}
	public static long fibonnaci(long number) {
		if(number==1|| number==2) {
			return 1;
		}
		return fibonnaci(number-1)+fibonnaci(number-2);
	}

}
