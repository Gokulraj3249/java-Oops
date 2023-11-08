package Day_14;
class EncapsulationDemo{
	private int ssn;
	private String empName;
	private int empAge;
	
	public int getEmpSSN() {
		return ssn;
	}
	public String getEmpName() {
		return empName;
	}
	
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int newValue) {
		empAge=newValue;
	}
	public void setEmpName(String newValue) {
		empName=newValue;
	}
	public void setEmpSSN(int newValue) {
		ssn=newValue;
	}
}
public class EncapsTest {
	public static void main(String[] args) {
		EncapsulationDemo obj=new EncapsulationDemo();
		obj.setEmpName("Alex");
		obj.setEmpAge(22);
		obj.setEmpSSN(3249);
		System.out.println("Employee Nmae:"+obj.getEmpName());
		System.out.println("Employee Age:"+obj.getEmpAge());
		System.out.println("Employee SSN:"+obj.getEmpSSN());
		

	}

}
