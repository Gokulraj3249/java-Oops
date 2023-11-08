import java.util.Scanner;

public class Constructor1 {
	int emp_id,salary;
	String emp_name;
	Constructor1(){
		//default Constructor - no parameter inside the Constructor method
		emp_id=1;
		emp_name="Hema";
		salary=20000;
	}
	Constructor1(int id, String name,int sal){
		//parameterized Constructor
		emp_id=id;
		emp_name=name;
		salary=sal;
	}
	void display() {
		System.out.println("Employee details: ");
		System.out.println("Employee Id: "+emp_id);
		System.out.println("Employee Name: "+emp_name);
		System.out.println("Salary: "+salary);
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int id,salary;
		String name;
		System.out.print("employee id: ");
		id=s.nextInt();
		System.out.print("employee name: ");
		name=s.next();
		System.out.print("employee salary: ");
		salary=s.nextInt();
		Constructor1 obj=new Constructor1();
		obj.display();
		Constructor1 obj1=new Constructor1(2,"Vinoth",25000);
		obj1.display();
		Constructor1 obj2=new Constructor1(id,name,salary);
		obj2.display();
		
		

	}

}
