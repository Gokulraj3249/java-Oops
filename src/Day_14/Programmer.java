package Day_14;
class Employee{
	String Name="Alex";
	int Age=19;
	int salary=40000;
}

public class Programmer extends Employee {
	int bonus=10000;
	public static void main(String[] args) {
		Programmer obj=new Programmer();
//		System.out.println("Name: "+obj.Name);
//		System.out.println("Age: "+obj.Age);
		System.out.println("Salary: "+obj.salary);
		System.out.println("Bonus: "+obj.bonus);
		

	}

}
