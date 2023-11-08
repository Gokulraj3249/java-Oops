import java.util.Scanner;

public class Class_Objects {
	static int id;
	static String name;
	static int m1,m2,m3;
    //class variable
    
    static void display(int id,String name,int m1,int m2, int m3) {
    	 float total,average; 
    	
    	 total=m1+m2+m3;
    	average=total/3;
    	System.out.println("Student details");
    	System.out.println("Student Id: "+id);
    	System.out.println("Student Name: "+name);
    	System.out.println("Mark 1: "+m1);
    	System.out.println("Mark 2: "+m2);
    	System.out.println("Mark 3: "+m3);
    	System.out.println("Total: "+total);
    	System.out.printf("Average: %.2f",average);
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Student Id: ");
		id=s.nextInt();
		System.out.print("Student Name: ");
		name=s.next();
		System.out.print("Mark 1: ");
		m1=s.nextInt();
		System.out.print("Mark 2: ");
		m2=s.nextInt();
		System.out.print("Mark 3: ");
		m3=s.nextInt();
		display(id,name,m1,m2,m3);
		s.close();

	}

}
