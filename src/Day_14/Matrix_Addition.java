package Day_14;

import java.util.Scanner;

public class Matrix_Addition {

	public static void main(String[] args) {
		int row,col;
		Scanner s=new Scanner(System.in);
	    System.out.print("Enter the row: ");
	    row=s.nextInt();
	    System.out.print("Enter the col: ");
	    col=s.nextInt();
	    int a[][] =new int[row][col];
	    int b[][]=new int[row][col];
	    int result[][]=new int[row][col];
	    
	    System.out.println("Enter the A Matrix values: ");
	    for(int i=0;i<row;i++) {
	    	for(int j=0;j<col;j++)
	    		a[i][j]=s.nextInt();
	    }
	    System.out.println("Enter the B Matrix values: ");
	    for(int i=0;i<row;i++) {
	    	for(int j=0;j<col;j++)
	    		b[i][j]=s.nextInt();
	    }
	    System.out.println("Matrix Addition: ");
	    for(int i=0;i<row;i++) {
	    	for(int j=0;j<col;j++) {
	    		result[i][j]=a[i][j]+b[i][j];
//	    		result[i][j]=Math.abs(a[i][j]-b[i][j]);       sub
	    	System.out.print(result[i][j]+" ");
	    }
	    System.out.println();
	    }
	}

}
